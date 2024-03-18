package me;

import Ng.C1059e0;
import android.gov.nist.javax.sip.header.SIPHeaderNames;
import id.AbstractC3557B;
import java.io.InputStream;
import java.util.List;
import te.C5760d;
import xe.AbstractC6414c;
import xe.AbstractC6435x;
import xe.C6417f;
import xe.C6433v;
import ze.AbstractC6846e;

/* renamed from: me.l  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4639l extends AbstractC6846e {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f39214a = 0;

    /* renamed from: b  reason: collision with root package name */
    public final Long f39215b;

    /* renamed from: c  reason: collision with root package name */
    public final C6417f f39216c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ Object f39217d;

    public C4639l(Ie.e eVar, C6417f c6417f, Object obj) {
        this.f39217d = obj;
        C6433v c6433v = ((C5760d) eVar.f8578Y).f46127c;
        List list = AbstractC6435x.f49956a;
        String i10 = c6433v.i(SIPHeaderNames.CONTENT_LENGTH);
        this.f39215b = i10 != null ? Long.valueOf(Long.parseLong(i10)) : null;
        this.f39216c = c6417f == null ? AbstractC6414c.f49881b : c6417f;
    }

    @Override // ze.AbstractC6848g
    public final Long a() {
        return this.f39215b;
    }

    @Override // ze.AbstractC6848g
    public final C6417f b() {
        return this.f39216c;
    }

    @Override // ze.AbstractC6846e
    public final io.ktor.utils.io.x e() {
        int i10 = this.f39214a;
        Object obj = this.f39217d;
        switch (i10) {
            case 0:
                return (io.ktor.utils.io.x) obj;
            default:
                InputStream inputStream = (InputStream) obj;
                Tg.d dVar = Ng.Q.f12906c;
                Oe.a aVar = Oe.b.f13740a;
                AbstractC3557B.c0("<this>", inputStream);
                AbstractC3557B.c0("context", dVar);
                AbstractC3557B.c0("pool", aVar);
                return R4.b.r2(C1059e0.f12936Y, dVar, true, new io.ktor.utils.io.jvm.javaio.m(aVar, inputStream, null)).f33364Z;
        }
    }

    public C4639l(C5760d c5760d, C6417f c6417f, Object obj) {
        this.f39217d = obj;
        List list = AbstractC6435x.f49956a;
        String i10 = c5760d.f46127c.i(SIPHeaderNames.CONTENT_LENGTH);
        this.f39215b = i10 != null ? Long.valueOf(Long.parseLong(i10)) : null;
        this.f39216c = c6417f == null ? AbstractC6414c.f49881b : c6417f;
    }
}
