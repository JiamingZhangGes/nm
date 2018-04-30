package cn.ges.nm.domain;

import java.time.LocalDateTime;

/**
 * @author gespent@163.com
 * @date 2018/4/30
 * 基础卡信息
 */
public class BaseCard {
    private String id;
    private LocalDateTime gmyCreate;
    private LocalDateTime gmtModified;

    private Integer isMagic;
    private Integer isToken;
    private Integer isWeapon;

    private String cardName;
    private String cardDesc;
    private String cardDesc2;

    private Integer rareDegreeId;
    private String imgPath;
    private Integer raceId;

    private Integer abilityId;
    private Integer attackpower;
    private Integer life;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public LocalDateTime getGmyCreate() {
        return gmyCreate;
    }

    public void setGmyCreate(LocalDateTime gmyCreate) {
        this.gmyCreate = gmyCreate;
    }

    public LocalDateTime getGmtModified() {
        return gmtModified;
    }

    public void setGmtModified(LocalDateTime gmtModified) {
        this.gmtModified = gmtModified;
    }

    public Integer getIsMagic() {
        return isMagic;
    }

    public void setIsMagic(Integer isMagic) {
        this.isMagic = isMagic;
    }

    public Integer getIsToken() {
        return isToken;
    }

    public void setIsToken(Integer isToken) {
        this.isToken = isToken;
    }

    public Integer getIsWeapon() {
        return isWeapon;
    }

    public void setIsWeapon(Integer isWeapon) {
        this.isWeapon = isWeapon;
    }

    public String getCardName() {
        return cardName;
    }

    public void setCardName(String cardName) {
        this.cardName = cardName;
    }

    public String getCardDesc() {
        return cardDesc;
    }

    public void setCardDesc(String cardDesc) {
        this.cardDesc = cardDesc;
    }

    public String getCardDesc2() {
        return cardDesc2;
    }

    public void setCardDesc2(String cardDesc2) {
        this.cardDesc2 = cardDesc2;
    }

    public Integer getRareDegreeId() {
        return rareDegreeId;
    }

    public void setRareDegreeId(Integer rareDegreeId) {
        this.rareDegreeId = rareDegreeId;
    }

    public String getImgPath() {
        return imgPath;
    }

    public void setImgPath(String imgPath) {
        this.imgPath = imgPath;
    }

    public Integer getRaceId() {
        return raceId;
    }

    public void setRaceId(Integer raceId) {
        this.raceId = raceId;
    }

    public Integer getAbilityId() {
        return abilityId;
    }

    public void setAbilityId(Integer abilityId) {
        this.abilityId = abilityId;
    }

    public Integer getAttackpower() {
        return attackpower;
    }

    public void setAttackpower(Integer attackpower) {
        this.attackpower = attackpower;
    }

    public Integer getLife() {
        return life;
    }

    public void setLife(Integer life) {
        this.life = life;
    }
}
