package wd;

import id.AbstractC3557B;
import qf.C5323a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier removed */
/* renamed from: wd.c  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class EnumC6181c extends Enum {

    /* renamed from: Z  reason: collision with root package name */
    public static final Wc.d f48384Z = new Wc.d(17, 0);

    /* renamed from: h0  reason: collision with root package name */
    public static final EnumC6181c f48385h0;

    /* renamed from: i0  reason: collision with root package name */
    public static final EnumC6181c f48386i0;

    /* renamed from: j0  reason: collision with root package name */
    public static final EnumC6181c f48387j0;

    /* renamed from: k0  reason: collision with root package name */
    public static final EnumC6181c f48388k0;

    /* renamed from: l0  reason: collision with root package name */
    public static final EnumC6181c f48389l0;

    /* renamed from: m0  reason: collision with root package name */
    public static final /* synthetic */ EnumC6181c[] f48390m0;

    /* renamed from: n0  reason: collision with root package name */
    public static final /* synthetic */ C5323a f48391n0;

    /* renamed from: Y  reason: collision with root package name */
    public final String f48392Y;

    static {
        EnumC6181c enumC6181c = new EnumC6181c("DisableUpgradeUi", 0, "disable_upgrade_ui");
        f48385h0 = enumC6181c;
        EnumC6181c enumC6181c2 = new EnumC6181c("BetaFeatures", 1, "beta_features");
        f48386i0 = enumC6181c2;
        EnumC6181c enumC6181c3 = new EnumC6181c("ChatPreferencesAvailable", 2, "chat_preferences_available");
        f48387j0 = enumC6181c3;
        EnumC6181c enumC6181c4 = new EnumC6181c("BreezeEnabled", 3, "breeze_available");
        f48388k0 = enumC6181c4;
        EnumC6181c enumC6181c5 = new EnumC6181c("MemoryAvailable", 4, "sunshine_available");
        f48389l0 = enumC6181c5;
        EnumC6181c[] enumC6181cArr = {enumC6181c, enumC6181c2, enumC6181c3, enumC6181c4, enumC6181c5};
        f48390m0 = enumC6181cArr;
        f48391n0 = AbstractC3557B.C0(enumC6181cArr);
    }

    public EnumC6181c(String str, int i10, String str2) {
        this.f48392Y = str2;
    }

    public static EnumC6181c valueOf(String str) {
        return (EnumC6181c) Enum.valueOf(EnumC6181c.class, str);
    }

    public static EnumC6181c[] values() {
        return (EnumC6181c[]) f48390m0.clone();
    }
}
