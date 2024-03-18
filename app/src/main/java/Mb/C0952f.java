package Mb;

import android.content.Context;
import b9.EnumC2132a;
import c9.AbstractC2307a;
import nf.AbstractC4825e;
import pf.AbstractC5156c;

/* renamed from: Mb.f  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0952f extends AbstractC5156c {

    /* renamed from: Y  reason: collision with root package name */
    public C0954g f11917Y;

    /* renamed from: Z  reason: collision with root package name */
    public Context f11918Z;

    /* renamed from: h0  reason: collision with root package name */
    public EnumC2132a f11919h0;

    /* renamed from: i0  reason: collision with root package name */
    public String f11920i0;

    /* renamed from: j0  reason: collision with root package name */
    public String f11921j0;

    /* renamed from: k0  reason: collision with root package name */
    public AbstractC2307a f11922k0;

    /* renamed from: l0  reason: collision with root package name */
    public Context f11923l0;

    /* renamed from: m0  reason: collision with root package name */
    public EnumC2132a f11924m0;

    /* renamed from: n0  reason: collision with root package name */
    public String f11925n0;

    /* renamed from: o0  reason: collision with root package name */
    public String f11926o0;

    /* renamed from: p0  reason: collision with root package name */
    public boolean f11927p0;

    /* renamed from: q0  reason: collision with root package name */
    public /* synthetic */ Object f11928q0;

    /* renamed from: r0  reason: collision with root package name */
    public final /* synthetic */ C0954g f11929r0;

    /* renamed from: s0  reason: collision with root package name */
    public int f11930s0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0952f(C0954g c0954g, AbstractC4825e abstractC4825e) {
        super(abstractC4825e);
        this.f11929r0 = c0954g;
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        this.f11928q0 = obj;
        this.f11930s0 |= Integer.MIN_VALUE;
        return this.f11929r0.o(null, null, null, null, false, this);
    }
}
