package Dd;

import ah.AbstractC1998i;
import id.AbstractC3557B;
import jf.AbstractC3957g;
import jf.EnumC3958h;

/* JADX WARN: Failed to restore enum class, 'enum' modifier removed */
@AbstractC1998i
/* renamed from: Dd.w  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class EnumC0401w extends Enum<EnumC0401w> {
    public static final C0400v Companion = new Object();

    /* renamed from: Y  reason: collision with root package name */
    public static final AbstractC3957g f3576Y = R4.b.C1(EnumC3958h.f36152Y, C0399u.f3575Y);

    /* renamed from: Z  reason: collision with root package name */
    public static final EnumC0401w f3577Z;

    /* renamed from: h0  reason: collision with root package name */
    public static final EnumC0401w f3578h0;

    /* renamed from: i0  reason: collision with root package name */
    public static final EnumC0401w f3579i0;

    /* renamed from: j0  reason: collision with root package name */
    public static final /* synthetic */ EnumC0401w[] f3580j0;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [Dd.v, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v1, types: [java.lang.Enum, Dd.w] */
    /* JADX WARN: Type inference failed for: r8v1, types: [java.lang.Enum, Dd.w] */
    /* JADX WARN: Type inference failed for: r9v1, types: [java.lang.Enum, Dd.w] */
    static {
        Enum r52 = new Enum("StateUpdate", 0);
        ?? r62 = new Enum("ActionRequest", 1);
        f3577Z = r62;
        Enum r72 = new Enum("ConversationUpdate", 2);
        ?? r82 = new Enum("RelayMessage", 3);
        f3578h0 = r82;
        ?? r92 = new Enum("Unknown", 4);
        f3579i0 = r92;
        EnumC0401w[] enumC0401wArr = {r52, r62, r72, r82, r92};
        f3580j0 = enumC0401wArr;
        AbstractC3557B.C0(enumC0401wArr);
    }

    public static EnumC0401w valueOf(String str) {
        return (EnumC0401w) Enum.valueOf(EnumC0401w.class, str);
    }

    public static EnumC0401w[] values() {
        return (EnumC0401w[]) f3580j0.clone();
    }
}
