package com.neusoft.day11.classMember;

/**
 * @author Eric Lee
 * @date 2020/7/25 14:26
 */
public class WangZheTest {
    public static void main(String[] args) {
        WangZheRole role = new WangZheRole();

//        role.setName("zhangsan")
        role.setFaShuSkill(new FaShuSkill() {
            @Override
            public void faShuAttack() {
                System.out.println("安琪拉的羊肉串");
            }
        });
        // 法术攻击
        role.faShuSkillAttack();
        // 更换技能
        role.setFaShuSkill(new FaShuSkill() {
            @Override
            public void faShuAttack() {
                System.out.println("大乔叫你回家");
            }
        });
        // 法术攻击
        role.faShuSkillAttack();



    }
}
