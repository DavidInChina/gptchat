package rd;

import I9.B;
import Ia.j;
import M1.AbstractC0928i;
import Ng.F;
import P1.i;
import id.AbstractC3557B;
import java.io.File;
import jf.C3963m;
import jf.y;
import nf.AbstractC4825e;
import of.EnumC5000a;
import pf.AbstractC5163j;
import q1.AbstractC5260f;
import td.C5756a;
import wf.k;

/* renamed from: rd.f  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC5482f {

    /* renamed from: f  reason: collision with root package name */
    public static final P1.f f44956f = new P1.f("value");

    /* renamed from: a  reason: collision with root package name */
    public final C5756a f44957a;

    /* renamed from: b  reason: collision with root package name */
    public final Object f44958b;

    /* renamed from: c  reason: collision with root package name */
    public final File f44959c;

    /* renamed from: d  reason: collision with root package name */
    public final C3963m f44960d;

    /* renamed from: e  reason: collision with root package name */
    public final j f44961e;

    public AbstractC5482f(C5477a c5477a, F f6, String str, C5756a c5756a, Object obj) {
        AbstractC3557B.c0("fileProvider", c5477a);
        AbstractC3557B.c0("scope", f6);
        AbstractC3557B.c0("name", str);
        this.f44957a = c5756a;
        this.f44958b = obj;
        this.f44959c = AbstractC5260f.I(c5477a.f44947a, str);
        C3963m D12 = R4.b.D1(new B(f6, 29, this));
        this.f44960d = D12;
        this.f44961e = new j(((AbstractC0928i) D12.getValue()).a(), 7, this);
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [pf.j, wf.n] */
    public final Object a(AbstractC4825e abstractC4825e) {
        Object b10 = ((AbstractC0928i) this.f44960d.getValue()).b(new i(new AbstractC5163j(2, null), null), abstractC4825e);
        if (b10 == EnumC5000a.f41328Y) {
            return b10;
        }
        return y.f36177a;
    }

    public final Object b(k kVar, AbstractC4825e abstractC4825e) {
        Object b10 = ((AbstractC0928i) this.f44960d.getValue()).b(new i(new C5481e(kVar, this, null), null), abstractC4825e);
        if (b10 == EnumC5000a.f41328Y) {
            return b10;
        }
        return y.f36177a;
    }
}
