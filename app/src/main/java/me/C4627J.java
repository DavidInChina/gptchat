package me;

import he.C3418c;
import id.AbstractC3557B;
import k6.AbstractC4194d;
import nf.AbstractC4825e;
import of.EnumC5000a;
import te.C5760d;
import te.C5765i;

/* renamed from: me.J  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4627J implements U {

    /* renamed from: a  reason: collision with root package name */
    public final int f39165a;

    /* renamed from: b  reason: collision with root package name */
    public final ge.d f39166b;

    /* renamed from: c  reason: collision with root package name */
    public int f39167c;

    /* renamed from: d  reason: collision with root package name */
    public C3418c f39168d;

    public C4627J(int i10, ge.d dVar) {
        AbstractC3557B.c0("client", dVar);
        this.f39165a = i10;
        this.f39166b = dVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0063  */
    @Override // me.U
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(C5760d c5760d, AbstractC4825e abstractC4825e) {
        C4626I c4626i;
        Object obj;
        int i10;
        C3418c c3418c;
        C4627J c4627j;
        if (abstractC4825e instanceof C4626I) {
            c4626i = (C4626I) abstractC4825e;
            int i11 = c4626i.f39164i0;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                c4626i.f39164i0 = i11 - Integer.MIN_VALUE;
                obj = c4626i.f39162Z;
                EnumC5000a enumC5000a = EnumC5000a.f41328Y;
                i10 = c4626i.f39164i0;
                c3418c = null;
                if (i10 == 0) {
                    if (i10 == 1) {
                        c4627j = c4626i.f39161Y;
                        com.google.android.gms.internal.play_billing.N.B0(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    com.google.android.gms.internal.play_billing.N.B0(obj);
                    C3418c c3418c2 = this.f39168d;
                    if (c3418c2 != null) {
                        Ad.l.P(c3418c2, null);
                    }
                    int i12 = this.f39167c;
                    int i13 = this.f39165a;
                    if (i12 < i13) {
                        this.f39167c = i12 + 1;
                        C5765i c5765i = this.f39166b.f31600m0;
                        Object obj2 = c5760d.f46128d;
                        c4626i.f39161Y = this;
                        c4626i.f39164i0 = 1;
                        obj = c5765i.a(c5760d, obj2, c4626i);
                        if (obj == enumC5000a) {
                            return enumC5000a;
                        }
                        c4627j = this;
                    } else {
                        throw new N7.a(AbstractC4194d.v("Max send count ", i13, " exceeded. Consider increasing the property maxSendCount if more is required."), 2);
                    }
                }
                if (obj instanceof C3418c) {
                    c3418c = (C3418c) obj;
                }
                if (c3418c == null) {
                    c4627j.f39168d = c3418c;
                    return c3418c;
                }
                throw new IllegalStateException(("Failed to execute send pipeline. Expected [HttpClientCall], but received " + obj).toString());
            }
        }
        c4626i = new C4626I(this, abstractC4825e);
        obj = c4626i.f39162Z;
        EnumC5000a enumC5000a2 = EnumC5000a.f41328Y;
        i10 = c4626i.f39164i0;
        c3418c = null;
        if (i10 == 0) {
        }
        if (obj instanceof C3418c) {
        }
        if (c3418c == null) {
        }
    }
}
