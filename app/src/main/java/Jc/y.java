package Jc;

import ah.AbstractC1998i;
import id.AbstractC3557B;
import jf.AbstractC3957g;
import jf.EnumC3958h;

/* JADX WARN: Failed to restore enum class, 'enum' modifier removed */
@AbstractC1998i
/* loaded from: classes2.dex */
public final class y extends Enum<y> {
    public static final x Companion = new Object();

    /* renamed from: Y  reason: collision with root package name */
    public static final AbstractC3957g f9075Y = R4.b.C1(EnumC3958h.f36152Y, w.f9074Y);

    /* renamed from: Z  reason: collision with root package name */
    public static final y f9076Z;

    /* renamed from: h0  reason: collision with root package name */
    public static final /* synthetic */ y[] f9077h0;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [Jc.x, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Enum, Jc.y] */
    static {
        Enum r32 = new Enum("Success", 0);
        Enum r42 = new Enum("Retry", 1);
        ?? r52 = new Enum("Error", 2);
        f9076Z = r52;
        y[] yVarArr = {r32, r42, r52};
        f9077h0 = yVarArr;
        AbstractC3557B.C0(yVarArr);
    }

    public static y valueOf(String str) {
        return (y) Enum.valueOf(y.class, str);
    }

    public static y[] values() {
        return (y[]) f9077h0.clone();
    }
}
