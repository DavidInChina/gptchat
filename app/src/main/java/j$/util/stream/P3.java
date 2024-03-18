package j$.util.stream;

import java.security.PrivilegedAction;

/* loaded from: classes3.dex */
public final /* synthetic */ class P3 implements PrivilegedAction {
    @Override // java.security.PrivilegedAction
    public final Object run() {
        return Boolean.valueOf(Boolean.getBoolean("org.openjdk.java.util.stream.tripwire"));
    }
}
