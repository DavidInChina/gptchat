package j$.util.stream;

import java.security.AccessController;
import java.security.PrivilegedAction;

/* loaded from: classes3.dex */
abstract class Q3 {

    /* renamed from: a  reason: collision with root package name */
    static final boolean f35509a = ((Boolean) AccessController.doPrivileged((PrivilegedAction<Object>) new Object())).booleanValue();

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void a(Class cls, String str) {
        throw new UnsupportedOperationException(cls + " tripwire tripped but logging not supported: " + str);
    }
}
