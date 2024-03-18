package Ah;

import java.security.ProtectionDomain;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX WARN: Init of enum EF30 can be incorrect */
/* JADX WARN: Init of enum EF43 can be incorrect */
/* JADX WARN: Init of enum EF56 can be incorrect */
/* JADX WARN: Init of enum Z can be incorrect */
/* loaded from: classes2.dex */
public enum Y implements V {
    WRAPPER(new X(r3, false)),
    /* JADX INFO: Fake field, exist only in values array */
    WRAPPER_PERSISTENT(new X(r6, false)),
    /* JADX INFO: Fake field, exist only in values array */
    CHILD_FIRST(new X(r3, true)),
    /* JADX INFO: Fake field, exist only in values array */
    CHILD_FIRST_PERSISTENT(new X(r6, true)),
    /* JADX INFO: Fake field, exist only in values array */
    INJECTION(new W(null, f0.f938Y, true));
    

    /* renamed from: Y  reason: collision with root package name */
    public final V f922Y;

    static {
        C0091j c0091j = EnumC0096o.LATENT;
        C0090i c0090i = EnumC0096o.MANIFEST;
    }

    Y(V v10) {
        this.f922Y = v10;
    }

    @Override // Ah.V
    public final V a(ProtectionDomain protectionDomain) {
        return this.f922Y.a(protectionDomain);
    }

    @Override // Ah.a0
    public final Map b(ClassLoader classLoader, LinkedHashMap linkedHashMap) {
        return this.f922Y.b(classLoader, linkedHashMap);
    }
}
