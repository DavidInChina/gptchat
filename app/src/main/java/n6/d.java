package n6;

import B6.n;
import B6.u;
import android.gov.nist.core.Separators;
import id.AbstractC3557B;
import l8.AbstractC4344b;
import p5.AbstractC5091c;
import p5.EnumC5090b;
import x6.C6309k0;
import x6.C6319n1;
import x6.G;
import x6.H0;
import x6.a2;

/* loaded from: classes.dex */
public final class d implements U5.a {

    /* renamed from: Y  reason: collision with root package name */
    public final U5.a f39632Y;

    /* renamed from: Z  reason: collision with root package name */
    public final U5.a f39633Z;

    /* renamed from: h0  reason: collision with root package name */
    public final U5.a f39634h0;

    /* renamed from: i0  reason: collision with root package name */
    public final U5.a f39635i0;

    /* renamed from: j0  reason: collision with root package name */
    public final U5.a f39636j0;

    /* renamed from: k0  reason: collision with root package name */
    public final U5.a f39637k0;

    /* renamed from: l0  reason: collision with root package name */
    public final AbstractC5091c f39638l0;

    public d(U5.a aVar, U5.a aVar2, U5.a aVar3, U5.a aVar4, U5.a aVar5, U5.a aVar6, AbstractC5091c abstractC5091c) {
        AbstractC3557B.c0("viewEventMapper", aVar);
        AbstractC3557B.c0("errorEventMapper", aVar2);
        AbstractC3557B.c0("resourceEventMapper", aVar3);
        AbstractC3557B.c0("actionEventMapper", aVar4);
        AbstractC3557B.c0("longTaskEventMapper", aVar5);
        AbstractC3557B.c0("telemetryConfigurationMapper", aVar6);
        AbstractC3557B.c0("internalLogger", abstractC5091c);
        this.f39632Y = aVar;
        this.f39633Z = aVar2;
        this.f39634h0 = aVar3;
        this.f39635i0 = aVar4;
        this.f39636j0 = aVar5;
        this.f39637k0 = aVar6;
        this.f39638l0 = abstractC5091c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        if (AbstractC3557B.K(this.f39632Y, dVar.f39632Y) && AbstractC3557B.K(this.f39633Z, dVar.f39633Z) && AbstractC3557B.K(this.f39634h0, dVar.f39634h0) && AbstractC3557B.K(this.f39635i0, dVar.f39635i0) && AbstractC3557B.K(this.f39636j0, dVar.f39636j0) && AbstractC3557B.K(this.f39637k0, dVar.f39637k0) && AbstractC3557B.K(this.f39638l0, dVar.f39638l0)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.f39633Z.hashCode();
        int hashCode2 = this.f39634h0.hashCode();
        int hashCode3 = this.f39635i0.hashCode();
        int hashCode4 = this.f39636j0.hashCode();
        int hashCode5 = this.f39637k0.hashCode();
        return this.f39638l0.hashCode() + ((hashCode5 + ((hashCode4 + ((hashCode3 + ((hashCode2 + ((hashCode + (this.f39632Y.hashCode() * 31)) * 31)) * 31)) * 31)) * 31)) * 31);
    }

    @Override // U5.a
    public final Object k(Object obj) {
        C6309k0 c6309k0;
        AbstractC3557B.c0("event", obj);
        boolean z10 = obj instanceof a2;
        if (z10) {
            c6309k0 = this.f39632Y.k(obj);
        } else if (obj instanceof G) {
            c6309k0 = this.f39635i0.k(obj);
        } else if (obj instanceof C6309k0) {
            C6309k0 c6309k02 = (C6309k0) obj;
            boolean K10 = AbstractC3557B.K(c6309k02.f49365t.f49134f, Boolean.TRUE);
            c6309k0 = c6309k02;
            if (!K10) {
                c6309k0 = (C6309k0) this.f39633Z.k(obj);
            }
        } else if (obj instanceof C6319n1) {
            c6309k0 = this.f39634h0.k(obj);
        } else if (obj instanceof H0) {
            c6309k0 = this.f39636j0.k(obj);
        } else if (obj instanceof B6.h) {
            c6309k0 = this.f39637k0.k(obj);
        } else {
            if (!(obj instanceof n) && !(obj instanceof u)) {
                P4.a.l0(this.f39638l0, 4, AbstractC4344b.G0(EnumC5090b.f42739Z, EnumC5090b.f42740h0), new R5.c(5, obj), null, 56);
            }
            c6309k0 = obj;
        }
        EnumC5090b enumC5090b = EnumC5090b.f42738Y;
        if (z10 && (c6309k0 == null || c6309k0 != obj)) {
            P4.a.m0(this.f39638l0, 5, enumC5090b, new R5.c(6, obj), null, false, 56);
        } else if (c6309k0 == null) {
            P4.a.m0(this.f39638l0, 3, enumC5090b, new R5.c(7, obj), null, false, 56);
            return null;
        } else if (c6309k0 != obj) {
            P4.a.m0(this.f39638l0, 4, enumC5090b, new R5.c(8, obj), null, false, 56);
            return null;
        }
        return obj;
    }

    public final String toString() {
        return "RumEventMapper(viewEventMapper=" + this.f39632Y + ", errorEventMapper=" + this.f39633Z + ", resourceEventMapper=" + this.f39634h0 + ", actionEventMapper=" + this.f39635i0 + ", longTaskEventMapper=" + this.f39636j0 + ", telemetryConfigurationMapper=" + this.f39637k0 + ", internalLogger=" + this.f39638l0 + Separators.RPAREN;
    }
}
