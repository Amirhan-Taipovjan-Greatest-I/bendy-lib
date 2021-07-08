package io.github.kosmx.bendylib.impl;

import io.github.kosmx.bendylib.ICuboidBuilder;
import io.github.kosmx.bendylib.MutableCuboid;
import net.minecraft.util.Pair;
import org.jetbrains.annotations.ApiStatus;

import javax.annotation.Nullable;

@Deprecated
@ApiStatus.Experimental
public class DummyCuboid implements MutableCuboid {
    @Override
    public boolean registerMutator(String name, ICuboidBuilder<ICuboid> builder) {
        return false;
    }

    @Override
    public boolean unregisterMutator(String name) {
        return true;
    }

    @Nullable
    @Override
    public Pair<String, ICuboid> getActiveMutator() {
        return null;
    }

    @Nullable
    @Override
    public ICuboid getMutator(String name) {
        return null;
    }

    @Nullable
    @Override
    public ICuboid getAndActivateMutator(@Nullable String name) {
        return null;
    }

    @Override
    public void copyStateFrom(MutableCuboid other) {

    }
}
