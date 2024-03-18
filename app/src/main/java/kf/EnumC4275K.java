package kf;

import id.AbstractC3557B;

/* JADX WARN: Failed to restore enum class, 'enum' modifier removed */
/* renamed from: kf.K  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class EnumC4275K extends Enum {

    /* renamed from: Y  reason: collision with root package name */
    public static final EnumC4275K f37460Y;

    /* renamed from: Z  reason: collision with root package name */
    public static final EnumC4275K f37461Z;

    /* renamed from: h0  reason: collision with root package name */
    public static final EnumC4275K f37462h0;

    /* renamed from: i0  reason: collision with root package name */
    public static final EnumC4275K f37463i0;

    /* renamed from: j0  reason: collision with root package name */
    public static final /* synthetic */ EnumC4275K[] f37464j0;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Enum, kf.K] */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Enum, kf.K] */
    /* JADX WARN: Type inference failed for: r6v1, types: [java.lang.Enum, kf.K] */
    /* JADX WARN: Type inference failed for: r7v1, types: [java.lang.Enum, kf.K] */
    static {
        ?? r42 = new Enum("Ready", 0);
        f37460Y = r42;
        ?? r52 = new Enum("NotReady", 1);
        f37461Z = r52;
        ?? r62 = new Enum("Done", 2);
        f37462h0 = r62;
        ?? r72 = new Enum("Failed", 3);
        f37463i0 = r72;
        EnumC4275K[] enumC4275KArr = {r42, r52, r62, r72};
        f37464j0 = enumC4275KArr;
        AbstractC3557B.C0(enumC4275KArr);
    }

    public static EnumC4275K valueOf(String str) {
        return (EnumC4275K) Enum.valueOf(EnumC4275K.class, str);
    }

    public static EnumC4275K[] values() {
        return (EnumC4275K[]) f37464j0.clone();
    }
}
