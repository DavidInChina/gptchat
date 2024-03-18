package sb;

import Z.o1;
import jf.y;
import nf.AbstractC4828h;
import wf.AbstractC6216a;

/* renamed from: sb.c  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5603c extends kotlin.jvm.internal.o implements AbstractC6216a {

    /* renamed from: Z  reason: collision with root package name */
    public static final C5603c f45498Z = new C5603c(0);

    /* renamed from: h0  reason: collision with root package name */
    public static final C5603c f45499h0 = new C5603c(1);

    /* renamed from: i0  reason: collision with root package name */
    public static final C5603c f45500i0 = new C5603c(2);

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f45501Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C5603c(int i10) {
        super(0);
        this.f45501Y = i10;
    }

    @Override // wf.AbstractC6216a
    /* renamed from: invoke */
    public final Object mo122invoke() {
        switch (this.f45501Y) {
            case 0:
                return y.f36177a;
            case 1:
                return AbstractC4828h.Z("", o1.f22665a);
            default:
                return new j0.u();
        }
    }
}
