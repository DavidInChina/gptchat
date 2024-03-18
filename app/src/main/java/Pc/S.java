package pc;

import id.AbstractC3557B;

/* JADX WARN: Failed to restore enum class, 'enum' modifier removed */
/* loaded from: classes2.dex */
public final class S extends Enum {

    /* renamed from: Y  reason: collision with root package name */
    public static final S f42940Y;

    /* renamed from: Z  reason: collision with root package name */
    public static final S f42941Z;

    /* renamed from: h0  reason: collision with root package name */
    public static final S f42942h0;

    /* renamed from: i0  reason: collision with root package name */
    public static final /* synthetic */ S[] f42943i0;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Enum, pc.S] */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Enum, pc.S] */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Enum, pc.S] */
    static {
        ?? r32 = new Enum("ShowUpsell", 0);
        f42940Y = r32;
        ?? r42 = new Enum("WarnAboutUnknownSubscriptionSource", 1);
        f42941Z = r42;
        ?? r52 = new Enum("ManageGooglePlaySubscription", 2);
        f42942h0 = r52;
        S[] sArr = {r32, r42, r52};
        f42943i0 = sArr;
        AbstractC3557B.C0(sArr);
    }

    public static S valueOf(String str) {
        return (S) Enum.valueOf(S.class, str);
    }

    public static S[] values() {
        return (S[]) f42943i0.clone();
    }
}
