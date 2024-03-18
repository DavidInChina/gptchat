package O9;

import ah.AbstractC1998i;
import id.AbstractC3557B;
import jf.AbstractC3957g;
import jf.EnumC3958h;

/* JADX WARN: Failed to restore enum class, 'enum' modifier removed */
@AbstractC1998i
/* renamed from: O9.l  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class EnumC1114l extends Enum<EnumC1114l> {
    public static final C1112k Companion = new Object();

    /* renamed from: Y  reason: collision with root package name */
    public static final AbstractC3957g f13551Y = R4.b.C1(EnumC3958h.f36152Y, C1110j.f13545Y);

    /* renamed from: Z  reason: collision with root package name */
    public static final EnumC1114l f13552Z;

    /* renamed from: h0  reason: collision with root package name */
    public static final EnumC1114l f13553h0;

    /* renamed from: i0  reason: collision with root package name */
    public static final EnumC1114l f13554i0;

    /* renamed from: j0  reason: collision with root package name */
    public static final /* synthetic */ EnumC1114l[] f13555j0;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [O9.k, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v1, types: [java.lang.Enum, O9.l] */
    /* JADX WARN: Type inference failed for: r7v1, types: [java.lang.Enum, O9.l] */
    /* JADX WARN: Type inference failed for: r9v1, types: [java.lang.Enum, O9.l] */
    static {
        Enum r52 = new Enum("MaxTokens", 0);
        ?? r62 = new Enum("Interrupted", 1);
        f13552Z = r62;
        ?? r72 = new Enum("Unknown", 2);
        f13553h0 = r72;
        Enum r82 = new Enum("Stop", 3);
        ?? r92 = new Enum("ContentFilter", 4);
        f13554i0 = r92;
        EnumC1114l[] enumC1114lArr = {r52, r62, r72, r82, r92};
        f13555j0 = enumC1114lArr;
        AbstractC3557B.C0(enumC1114lArr);
    }

    public static EnumC1114l valueOf(String str) {
        return (EnumC1114l) Enum.valueOf(EnumC1114l.class, str);
    }

    public static EnumC1114l[] values() {
        return (EnumC1114l[]) f13555j0.clone();
    }
}
