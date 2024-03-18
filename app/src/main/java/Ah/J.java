package Ah;

import java.net.URL;
import java.security.ProtectionDomain;

/* loaded from: classes2.dex */
public interface J {
    Class b(ClassLoader classLoader, String str);

    Package c(ClassLoader classLoader, String str);

    Class d(ClassLoader classLoader, String str, ProtectionDomain protectionDomain, byte[] bArr);

    Package e(ClassLoader classLoader, String str, String str2, String str3, String str4, String str5, String str6, String str7, URL url);

    Package f(ClassLoader classLoader, String str);

    Object g(ClassLoader classLoader, String str);
}
