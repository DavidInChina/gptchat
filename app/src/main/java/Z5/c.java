package Z5;

import M3.H;
import id.AbstractC3557B;
import java.util.HashSet;
import java.util.LinkedHashMap;
import jf.C3959i;
import kf.AbstractC4268D;
import p5.EnumC5090b;
import r5.AbstractC5368c;
import t5.AbstractC5675a;
import y5.h;

/* loaded from: classes2.dex */
public final class c implements d {

    /* renamed from: Y  reason: collision with root package name */
    public final String f23215Y;

    /* renamed from: Z  reason: collision with root package name */
    public final X5.b f23216Z;

    /* renamed from: h0  reason: collision with root package name */
    public final r5.d f23217h0;

    /* renamed from: i0  reason: collision with root package name */
    public final AbstractC5675a f23218i0;

    /* renamed from: j0  reason: collision with root package name */
    public final boolean f23219j0;

    /* renamed from: k0  reason: collision with root package name */
    public final boolean f23220k0;

    /* renamed from: l0  reason: collision with root package name */
    public final boolean f23221l0;

    /* renamed from: m0  reason: collision with root package name */
    public final S5.d f23222m0;

    /* renamed from: n0  reason: collision with root package name */
    public final int f23223n0;

    public c(String str, X5.a aVar, r5.d dVar, AbstractC5675a abstractC5675a, boolean z10, boolean z11, boolean z12, S5.c cVar, int i10) {
        AbstractC3557B.c0("loggerName", str);
        AbstractC3557B.c0("sdkCore", dVar);
        AbstractC3557B.c0("writer", abstractC5675a);
        this.f23215Y = str;
        this.f23216Z = aVar;
        this.f23217h0 = dVar;
        this.f23218i0 = abstractC5675a;
        this.f23219j0 = z10;
        this.f23220k0 = z11;
        this.f23221l0 = z12;
        this.f23222m0 = cVar;
        this.f23223n0 = i10;
    }

    @Override // Z5.d
    public final void g(int i10, String str, Throwable th2, LinkedHashMap linkedHashMap, HashSet hashSet, Long l10) {
        long currentTimeMillis;
        AbstractC3557B.c0("message", str);
        if (i10 < this.f23223n0) {
            return;
        }
        if (l10 != null) {
            currentTimeMillis = l10.longValue();
        } else {
            currentTimeMillis = System.currentTimeMillis();
        }
        long j6 = currentTimeMillis;
        boolean b10 = ((S5.c) this.f23222m0).b();
        EnumC5090b enumC5090b = EnumC5090b.f42738Y;
        r5.d dVar = this.f23217h0;
        if (b10) {
            AbstractC5368c h10 = dVar.h("logs");
            if (h10 != null) {
                H.B0(h10, new a(this, i10, str, th2, linkedHashMap, hashSet, Thread.currentThread().getName(), j6));
            } else {
                P4.a.m0(dVar.l(), 4, enumC5090b, b.f23212Z, null, false, 56);
            }
        }
        if (i10 >= 6) {
            AbstractC5368c h11 = dVar.h("rum");
            if (h11 != null) {
                ((h) h11).a(AbstractC4268D.a1(new C3959i("type", "logger_error"), new C3959i("message", str), new C3959i("throwable", th2), new C3959i("attributes", linkedHashMap)));
                return;
            }
            P4.a.m0(dVar.l(), 3, enumC5090b, b.f23213h0, null, false, 56);
        }
    }
}
