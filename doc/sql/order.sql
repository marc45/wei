DROP TABLE IF EXISTS `order_info`;
CREATE TABLE `order_info` (
  `id` char(32) NOT NULL DEFAULT '' COMMENT 'ID',
  `order_no` varchar(50) COMMENT '订单编号',
  `status` VARCHAR(50) COMMENT '订单状态：I：初始，P：处理中，S：成功，F：失败',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='订单信息';