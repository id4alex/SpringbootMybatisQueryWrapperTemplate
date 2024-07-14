# Description

本项目旨在帮助快速构建springboot + mybatisplus + querywrapper template项目。

模板接口 `fun.alex.su.springbootmybatisquerywrappertemplate.service.SqlWrapperService` 提供了`queryWrapper()`, `lambdaQueryWrapper()`, `updateWrapper()`, `lambdaUpdateWrapper()`。

具体service类只需要 extends ServiceImpl<ModelDao, Model> 就可以自动添加上述三个方法。


    default QueryWrapper<T> queryWrapper() {
        return new QueryWrapper<>();
    }

    default LambdaQueryWrapper<T> lambdaQueryWrapper() {
        return new LambdaQueryWrapper<>();
    }

    default UpdateWrapper<T> updateWrapper() {
        return new UpdateWrapper<>();
    }

    default LambdaUpdateWrapper<T> lambdaUpdateWrapper() {
        return new LambdaUpdateWrapper<>();
    }