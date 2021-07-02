package com.zzz.gulimall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.zzz.common.utils.PageUtils;
import com.zzz.gulimall.product.entity.SpuImagesEntity;

import java.util.Map;

/**
 * spu图片
 *
 * @author zzz
 * @email 642968382@qq.com
 * @date 2021-07-02 21:40:09
 */
public interface SpuImagesService extends IService<SpuImagesEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

