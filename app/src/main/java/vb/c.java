package Vb;

import ah.AbstractC1998i;
import id.AbstractC3557B;
import jf.AbstractC3957g;
import jf.EnumC3958h;

/* JADX WARN: Failed to restore enum class, 'enum' modifier removed */
@AbstractC1998i
/* loaded from: classes2.dex */
public final class c extends Enum<c> {
    public static final b Companion = new Object();

    /* renamed from: Y  reason: collision with root package name */
    public static final AbstractC3957g f18506Y = R4.b.C1(EnumC3958h.f36152Y, a.f18505Y);

    /* renamed from: Z  reason: collision with root package name */
    public static final /* synthetic */ c[] f18507Z;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [Vb.b, java.lang.Object] */
    static {
        c[] cVarArr = {new Enum("PartialOutage", 0), new Enum("FullOutage", 1), new Enum("Normal", 2)};
        f18507Z = cVarArr;
        AbstractC3557B.C0(cVarArr);
    }

    public static c valueOf(String str) {
        return (c) Enum.valueOf(c.class, str);
    }

    public static c[] values() {
        return (c[]) f18507Z.clone();
    }
}
