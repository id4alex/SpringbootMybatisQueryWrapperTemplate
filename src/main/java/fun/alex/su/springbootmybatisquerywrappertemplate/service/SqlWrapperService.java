package fun.alex.su.springbootmybatisquerywrappertemplate.service;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.conditions.update.LambdaUpdateWrapper;
import com.baomidou.mybatisplus.core.conditions.update.UpdateWrapper;

public interface SqlWrapperService<T> {
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
}