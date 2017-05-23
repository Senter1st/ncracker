package ru.ncteam.levelchat.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonBackReference;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "CHAT")
public class Chat {
    @Id
    @Column(name = "CHAT_ID")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "LCSEQ")
    @SequenceGenerator(name = "LCSEQ", sequenceName = "LCSEQ", allocationSize = 1)
    private long chatId;

    @Column(name = "NAME_CHAT", length = 100)
    private String nameChat;

    @Column(name = "STATUS_CHAT", length = 20)
    private char statusChat;

    @Column(name = "LIST_ID")
    private long listId;

    @ManyToOne
    @JoinColumn(name = "LEVEL_ID", nullable = false)
    private Levels level;

    @Column(name = "PERSONAL_CHAT")
    private boolean isPersonalChat;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "chat")
    @JsonIgnore
    public Set<UserChat> userChats = new HashSet<UserChat>();

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "chat")
    @JsonIgnore
    public Set<Message> messages = new HashSet<Message>();

    @JsonIgnore
    public Set<UserChat> getUserChats() {
        return userChats;
    }

    public void setUserChats(Set<UserChat> userChats) {
        this.userChats = userChats;
    }

    public long getChatId() {
        return chatId;
    }

    public void setChatId(long chatId) {
        this.chatId = chatId;
    }

    public String getNameChat() {
        return nameChat;
    }

    public void setNameChat(String nameChat) {
        this.nameChat = nameChat;
    }

    public char getStatusChat() {
        return statusChat;
    }

    public void setStatusChat(char statusChat) {
        this.statusChat = statusChat;
    }

    public long getListId() {
        return listId;
    }

    public void setListId(long listId) {
        this.listId = listId;
    }

    public Levels getLevel() {
        return level;
    }

    public void setLevel(Levels level) {
        this.level = level;
    }

    public boolean isPersonalChat() {
        return isPersonalChat;
    }

    public void setPersonalChat(boolean personalChat) {
        isPersonalChat = personalChat;
    }


    public Set<Message> getMessages() {
        return messages;
    }

    public void setMessages(Set<Message> messages) {
        this.messages = messages;
    }
}
