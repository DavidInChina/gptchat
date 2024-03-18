package Dd;

import ah.AbstractC1998i;
import id.AbstractC3557B;
import jf.AbstractC3957g;
import jf.EnumC3958h;

/* JADX WARN: Failed to restore enum class, 'enum' modifier removed */
@AbstractC1998i
/* loaded from: classes.dex */
public final class N extends Enum<N> {
    public static final M Companion = new Object();

    /* renamed from: Y  reason: collision with root package name */
    public static final AbstractC3957g f3524Y = R4.b.C1(EnumC3958h.f36152Y, L.f3523Y);

    /* renamed from: Z  reason: collision with root package name */
    public static final N f3525Z;

    /* renamed from: h0  reason: collision with root package name */
    public static final N f3526h0;

    /* renamed from: i0  reason: collision with root package name */
    public static final N f3527i0;

    /* renamed from: j0  reason: collision with root package name */
    public static final N f3528j0;

    /* renamed from: k0  reason: collision with root package name */
    public static final /* synthetic */ N[] f3529k0;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, Dd.M] */
    /* JADX WARN: Type inference failed for: r10v1, types: [Dd.N, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r11v1, types: [Dd.N, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r12v1, types: [Dd.N, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r7v0, types: [Dd.N, java.lang.Enum] */
    static {
        ?? r72 = new Enum("Idle", 0);
        f3525Z = r72;
        Enum r82 = new Enum("Connected", 1);
        Enum r92 = new Enum("Halted", 2);
        ?? r10 = new Enum("Listening", 3);
        f3526h0 = r10;
        ?? r11 = new Enum("ListeningIntently", 4);
        f3527i0 = r11;
        ?? r12 = new Enum("Thinking", 5);
        f3528j0 = r12;
        N[] nArr = {r72, r82, r92, r10, r11, r12, new Enum("Speaking", 6)};
        f3529k0 = nArr;
        AbstractC3557B.C0(nArr);
    }

    public static N valueOf(String str) {
        return (N) Enum.valueOf(N.class, str);
    }

    public static N[] values() {
        return (N[]) f3529k0.clone();
    }
}
