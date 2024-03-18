package me;

import xe.AbstractC6414c;
import xe.C6417f;
import ze.AbstractC6844c;

/* renamed from: me.k  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4638k extends AbstractC6844c {

    /* renamed from: a  reason: collision with root package name */
    public final C6417f f39211a;

    /* renamed from: b  reason: collision with root package name */
    public final long f39212b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ Object f39213c;

    public C4638k(C6417f c6417f, Object obj) {
        this.f39213c = obj;
        if (c6417f == null) {
            C6417f c6417f2 = AbstractC6414c.f49880a;
            c6417f = AbstractC6414c.f49881b;
        }
        this.f39211a = c6417f;
        this.f39212b = ((byte[]) obj).length;
    }

    @Override // ze.AbstractC6848g
    public final Long a() {
        return Long.valueOf(this.f39212b);
    }

    @Override // ze.AbstractC6848g
    public final C6417f b() {
        return this.f39211a;
    }

    @Override // ze.AbstractC6844c
    public final byte[] e() {
        return (byte[]) this.f39213c;
    }
}
