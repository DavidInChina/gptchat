package Ca;

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
    public static final AbstractC3957g f2855Y = R4.b.C1(EnumC3958h.f36152Y, w.f2854Y);

    /* renamed from: Z  reason: collision with root package name */
    public static final /* synthetic */ y[] f2856Z;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [Ca.x, java.lang.Object] */
    static {
        y[] yVarArr = {new Enum("AboutUserMessage", 0), new Enum("AboutModelMessage", 1)};
        f2856Z = yVarArr;
        AbstractC3557B.C0(yVarArr);
    }

    public static y valueOf(String str) {
        return (y) Enum.valueOf(y.class, str);
    }

    public static y[] values() {
        return (y[]) f2856Z.clone();
    }
}
