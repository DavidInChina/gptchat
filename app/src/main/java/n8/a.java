package N8;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import r9.y;

/* loaded from: classes.dex */
public final class a extends y {
    @Override // r9.y
    public final boolean G0(Class cls) {
        return false;
    }

    @Override // r9.y
    public final Method i0(Class cls, Field field) {
        throw new UnsupportedOperationException("Records are not supported on this JVM, this method should not be called");
    }

    @Override // r9.y
    public final Constructor k0(Class cls) {
        throw new UnsupportedOperationException("Records are not supported on this JVM, this method should not be called");
    }

    @Override // r9.y
    public final String[] w0(Class cls) {
        throw new UnsupportedOperationException("Records are not supported on this JVM, this method should not be called");
    }
}
