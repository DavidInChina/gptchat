package J5;

import F5.g;
import G5.d;
import G5.e;
import G5.h;
import G5.i;
import H5.c;
import M3.H;
import N.C1040y;
import id.AbstractC3557B;
import java.io.File;
import l8.AbstractC4344b;
import p5.AbstractC5091c;
import p5.EnumC5090b;

/* loaded from: classes2.dex */
public abstract class b implements g {

    /* renamed from: a  reason: collision with root package name */
    public final d f8858a;

    /* renamed from: b  reason: collision with root package name */
    public final R5.b f8859b;

    /* renamed from: c  reason: collision with root package name */
    public final h f8860c;

    /* renamed from: d  reason: collision with root package name */
    public final AbstractC5091c f8861d;

    /* renamed from: e  reason: collision with root package name */
    public final e f8862e;

    public b(c cVar, f8.e eVar, i iVar, AbstractC5091c abstractC5091c, e eVar2) {
        AbstractC3557B.c0("internalLogger", abstractC5091c);
        this.f8858a = cVar;
        this.f8859b = eVar;
        this.f8860c = iVar;
        this.f8861d = abstractC5091c;
        this.f8862e = eVar2;
    }

    @Override // F5.g
    public final void a(Object obj) {
        byte[] r02 = H.r0(this.f8859b, obj, this.f8861d);
        if (r02 != null) {
            synchronized (this) {
                b(r02);
            }
        }
    }

    public final void b(byte[] bArr) {
        int length = bArr.length;
        if (length > this.f8862e.f6057c) {
            P4.a.l0(this.f8861d, 5, AbstractC4344b.G0(EnumC5090b.f42738Y, EnumC5090b.f42740h0), new C1040y(length, this, 3), null, 56);
            return;
        }
        File v10 = this.f8858a.v(false);
        if (v10 == null) {
            return;
        }
        this.f8860c.b(v10, bArr, false);
    }
}
