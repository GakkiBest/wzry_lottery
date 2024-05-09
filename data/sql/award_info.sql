-- auto-generated definition
create table award
(
    id          bigint unsigned zerofill auto_increment comment '自增ID'
        primary key,
    award_name  varchar(256) charset utf8mb4 not null comment '奖品名称',
    probability decimal(10, 4)               not null comment '奖品中奖概率'
)
    collate = utf8mb4_unicode_ci;

INSERT INTO `draw`.`award` (`id`, `award_name`, `probability`) VALUES (00000000000000000001, '随机限定皮肤礼', 0.0020);
INSERT INTO `draw`.`award` (`id`, `award_name`, `probability`) VALUES (00000000000000000002, '魔女契约', 0.0020);
INSERT INTO `draw`.`award` (`id`, `award_name`, `probability`) VALUES (00000000000000000003, '随机传说皮肤', 0.0050);
INSERT INTO `draw`.`award` (`id`, `award_name`, `probability`) VALUES (00000000000000000004, '随机皮肤', 0.1350);
INSERT INTO `draw`.`award` (`id`, `award_name`, `probability`) VALUES (00000000000000000005, '魔力值', 0.5850);
INSERT INTO `draw`.`award` (`id`, `award_name`, `probability`) VALUES (00000000000000000006, '皮肤碎片 x 8', 0.1500);
INSERT INTO `draw`.`award` (`id`, `award_name`, `probability`) VALUES (00000000000000000007, '魔女的祝福 x 8', 0.1210);



create table magic_prop
(
    id          bigint auto_increment comment '自增ID'
        primary key,
    prop_name   varchar(20)    not null comment '魔力值道具名称',
    probability decimal(10, 4) not null comment '概率'
);

INSERT INTO `draw`.`magic_prop` (`id`, `prop_name`, `probability`) VALUES (1, '魔力值 x 8', 0.3760);
INSERT INTO `draw`.`magic_prop` (`id`, `prop_name`, `probability`) VALUES (2, '魔力值 x 18', 0.5130);
INSERT INTO `draw`.`magic_prop` (`id`, `prop_name`, `probability`) VALUES (3, '魔力值 x 28', 0.0940);
INSERT INTO `draw`.`magic_prop` (`id`, `prop_name`, `probability`) VALUES (4, '魔力值 x 68', 0.0170);


create table random_limit_skin
(
    id          bigint auto_increment comment '自增ID'
        primary key,
    skin_name   varchar(20)    not null comment '皮肤名称',
    probability decimal(10, 2) not null comment '皮肤抽取概率'
);

INSERT INTO `draw`.`random_limit_skin` (`id`, `skin_name`, `probability`) VALUES (1, '小乔-时之魔女', 0.01);
INSERT INTO `draw`.`random_limit_skin` (`id`, `skin_name`, `probability`) VALUES (2, '孙悟空-孙行者', 0.33);
INSERT INTO `draw`.`random_limit_skin` (`id`, `skin_name`, `probability`) VALUES (3, '黄忠-烈魂', 0.33);
INSERT INTO `draw`.`random_limit_skin` (`id`, `skin_name`, `probability`) VALUES (4, '蔡文姬-奇迹圣诞', 0.33);


CREATE TABLE `random_skin` (
                               `id` bigint NOT NULL AUTO_INCREMENT COMMENT '自增ID',
                               `skin_name` varchar(20) NOT NULL COMMENT '皮肤类型',
                               `probability` decimal(10,2) NOT NULL COMMENT '概率',
                               PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci

INSERT INTO `draw`.`random_skin` (`id`, `skin_name`, `probability`) VALUES (1, '史诗皮肤', 0.10);
INSERT INTO `draw`.`random_skin` (`id`, `skin_name`, `probability`) VALUES (2, '勇者皮肤', 0.30);
INSERT INTO `draw`.`random_skin` (`id`, `skin_name`, `probability`) VALUES (3, '伴生皮肤', 0.60);


