package M9;

import ah.AbstractC1998i;
import id.AbstractC3557B;
import jf.AbstractC3957g;
import jf.EnumC3958h;

/* JADX WARN: Failed to restore enum class, 'enum' modifier removed */
@AbstractC1998i
/* loaded from: classes.dex */
public final class c extends Enum<c> {
    public static final b Companion = new Object();

    /* renamed from: Y  reason: collision with root package name */
    public static final AbstractC3957g f11725Y = R4.b.C1(EnumC3958h.f36152Y, a.f11724Y);

    /* renamed from: Z  reason: collision with root package name */
    public static final c f11726Z;

    /* renamed from: h0  reason: collision with root package name */
    public static final /* synthetic */ c[] f11727h0;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [M9.b, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v0, types: [M9.c, java.lang.Enum] */
    static {
        ?? r12 = new Enum("ThumbsDown", 0);
        f11726Z = r12;
        c[] cVarArr = {r12};
        f11727h0 = cVarArr;
        AbstractC3557B.C0(cVarArr);
    }

    public static c valueOf(String str) {
        return (c) Enum.valueOf(c.class, str);
    }

    public static c[] values() {
        return (c[]) f11727h0.clone();
    }
}
