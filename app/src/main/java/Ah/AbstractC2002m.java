package ah;

import dh.AbstractC2711m;
import dh.C2715q;
import dh.C2716s;

/* renamed from: ah.m  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC2002m {

    /* renamed from: a  reason: collision with root package name */
    public static final C2715q f24213a;

    /* renamed from: b  reason: collision with root package name */
    public static final C2715q f24214b;

    /* renamed from: c  reason: collision with root package name */
    public static final C2716s f24215c;

    /* renamed from: d  reason: collision with root package name */
    public static final C2716s f24216d;

    static {
        C2715q c2715q;
        C2715q c2715q2;
        C2716s c2716s;
        C2716s c2716s2;
        C2001l c2001l = C2001l.f24210Z;
        boolean z10 = AbstractC2711m.f28465a;
        if (z10) {
            c2715q = new C2715q(0, c2001l);
        } else {
            c2715q = new C2715q(1, c2001l);
        }
        f24213a = c2715q;
        C2001l c2001l2 = C2001l.f24211h0;
        if (z10) {
            c2715q2 = new C2715q(0, c2001l2);
        } else {
            c2715q2 = new C2715q(1, c2001l2);
        }
        f24214b = c2715q2;
        C2000k c2000k = C2000k.f24207Z;
        if (z10) {
            c2716s = new C2716s(c2000k, 0);
        } else {
            c2716s = new C2716s(c2000k, 1);
        }
        f24215c = c2716s;
        C2000k c2000k2 = C2000k.f24208h0;
        if (z10) {
            c2716s2 = new C2716s(c2000k2, 0);
        } else {
            c2716s2 = new C2716s(c2000k2, 1);
        }
        f24216d = c2716s2;
    }
}
