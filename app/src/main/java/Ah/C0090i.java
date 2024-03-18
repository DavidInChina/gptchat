package Ah;

import android.gov.nist.core.Separators;
import j$.util.concurrent.ConcurrentHashMap;
import java.net.URL;
import java.security.AccessController;

/* JADX WARN: Failed to restore enum class, 'enum' modifier removed */
/* renamed from: Ah.i  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0090i extends EnumC0096o {
    @Override // Ah.EnumC0096o
    public final byte[] a(String str, ConcurrentHashMap concurrentHashMap) {
        return (byte[]) concurrentHashMap.get(str);
    }

    @Override // Ah.EnumC0096o
    public final URL b(String str, ConcurrentHashMap concurrentHashMap) {
        if (!str.endsWith(".class")) {
            AbstractC0089h abstractC0089h = C0103w.f962g;
            return null;
        }
        if (str.startsWith(Separators.SLASH)) {
            str = str.substring(1);
        }
        byte[] bArr = (byte[]) concurrentHashMap.get(str.replace('/', '.').substring(0, str.length() - 6));
        if (bArr == null) {
            AbstractC0089h abstractC0089h2 = C0103w.f962g;
            return null;
        }
        C0095n c0095n = new C0095n(str, bArr);
        if (C0103w.f964i) {
            return (URL) AccessController.doPrivileged(c0095n);
        }
        c0095n.run();
        throw null;
    }
}
