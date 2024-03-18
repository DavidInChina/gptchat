package io.sentry;

import java.util.UUID;

/* loaded from: classes2.dex */
public final class I1 extends A1 {

    /* renamed from: u0  reason: collision with root package name */
    public static final io.sentry.protocol.B f33801u0 = io.sentry.protocol.B.CUSTOM;

    /* renamed from: p0  reason: collision with root package name */
    public String f33802p0;

    /* renamed from: q0  reason: collision with root package name */
    public io.sentry.protocol.B f33803q0;

    /* renamed from: r0  reason: collision with root package name */
    public U3.n f33804r0;

    /* renamed from: s0  reason: collision with root package name */
    public C3634c f33805s0;

    /* renamed from: t0  reason: collision with root package name */
    public W f33806t0 = W.SENTRY;

    public I1(String str, io.sentry.protocol.B b10, String str2, U3.n nVar) {
        super(new io.sentry.protocol.s((UUID) null), new B1(), str2, null, null);
        Ad.l.Z0("name is required", str);
        this.f33802p0 = str;
        this.f33803q0 = b10;
        this.f33717i0 = nVar;
    }
}
