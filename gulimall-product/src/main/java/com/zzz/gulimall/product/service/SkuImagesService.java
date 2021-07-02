package com.zzz.gulimall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.zzz.common.utils.PageUtils;
import com.zzz.gulimall.product.entity.SkuImagesEntity;

import java.util.Map;

/**
 * sku图片
 *
 * @author zzz
 * @email 642968382@qq.com
 * @date 2021-07-02 21:40:08
 */
public interface SkuImagesService extends IService<SkuImagesEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

