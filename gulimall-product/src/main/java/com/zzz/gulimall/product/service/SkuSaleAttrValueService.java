package com.zzz.gulimall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.zzz.common.utils.PageUtils;
import com.zzz.gulimall.product.entity.SkuSaleAttrValueEntity;

import java.util.Map;

/**
 * sku销售属性&值
 *
 * @author zzz
 * @email 642968382@qq.com
 * @date 2021-07-02 21:40:09
 */
public interface SkuSaleAttrValueService extends IService<SkuSaleAttrValueEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

