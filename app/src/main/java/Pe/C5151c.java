package pe;

import L.C0840c;
import Yc.q;
import android.gov.nist.core.Separators;
import com.google.android.gms.internal.play_billing.N;
import id.AbstractC3557B;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.TimeZone;
import jf.y;
import kf.s;
import nf.AbstractC4825e;
import of.EnumC5000a;
import xe.C6410O;
import xe.C6419h;

/* renamed from: pe.c  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5151c implements AbstractC5152d {

    /* renamed from: Y  reason: collision with root package name */
    public final ArrayList f43094Y = new ArrayList();
    private volatile /* synthetic */ long oldestCookie = 0;

    /* renamed from: Z  reason: collision with root package name */
    public final Wg.d f43095Z = Wg.e.a();

    /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0059 A[Catch: all -> 0x00aa, TryCatch #0 {all -> 0x00aa, blocks: (B:18:0x004d, B:20:0x0059, B:21:0x006f, B:23:0x0075, B:25:0x007f, B:26:0x0086, B:27:0x0088, B:28:0x0093, B:30:0x0099, B:32:0x00a6), top: B:38:0x004d }] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0099 A[Catch: all -> 0x00aa, TryCatch #0 {all -> 0x00aa, blocks: (B:18:0x004d, B:20:0x0059, B:21:0x006f, B:23:0x0075, B:25:0x007f, B:26:0x0086, B:27:0x0088, B:28:0x0093, B:30:0x0099, B:32:0x00a6), top: B:38:0x004d }] */
    @Override // pe.AbstractC5152d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Serializable G0(C6410O c6410o, AbstractC4825e abstractC4825e) {
        C5150b c5150b;
        int i10;
        Wg.d dVar;
        C6410O c6410o2;
        C5151c c5151c;
        long currentTimeMillis;
        Iterator it;
        try {
            if (abstractC4825e instanceof C5150b) {
                c5150b = (C5150b) abstractC4825e;
                int i11 = c5150b.f43093k0;
                if ((i11 & Integer.MIN_VALUE) != 0) {
                    c5150b.f43093k0 = i11 - Integer.MIN_VALUE;
                    Object obj = c5150b.f43091i0;
                    EnumC5000a enumC5000a = EnumC5000a.f41328Y;
                    i10 = c5150b.f43093k0;
                    if (i10 == 0) {
                        if (i10 == 1) {
                            dVar = c5150b.f43090h0;
                            c6410o2 = c5150b.f43089Z;
                            c5151c = c5150b.f43088Y;
                            N.B0(obj);
                        } else {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                    } else {
                        N.B0(obj);
                        Wg.d dVar2 = this.f43095Z;
                        c5150b.f43088Y = this;
                        c5150b.f43089Z = c6410o;
                        c5150b.f43090h0 = dVar2;
                        c5150b.f43093k0 = 1;
                        if (dVar2.e(null, c5150b) == enumC5000a) {
                            return enumC5000a;
                        }
                        c5151c = this;
                        c6410o2 = c6410o;
                        dVar = dVar2;
                    }
                    TimeZone timeZone = He.a.f7667a;
                    currentTimeMillis = System.currentTimeMillis();
                    if (currentTimeMillis >= c5151c.oldestCookie) {
                        s.R1(new C0840c(currentTimeMillis, 6), c5151c.f43094Y);
                        Iterator it2 = c5151c.f43094Y.iterator();
                        long j6 = Long.MAX_VALUE;
                        while (it2.hasNext()) {
                            He.b bVar = ((C6419h) it2.next()).f49892e;
                            if (bVar != null) {
                                j6 = Math.min(j6, bVar.f7676n0);
                            }
                        }
                        c5151c.oldestCookie = j6;
                    }
                    ArrayList arrayList = c5151c.f43094Y;
                    ArrayList arrayList2 = new ArrayList();
                    it = arrayList.iterator();
                    while (it.hasNext()) {
                        Object next = it.next();
                        if (R4.b.G1((C6419h) next, c6410o2)) {
                            arrayList2.add(next);
                        }
                    }
                    return arrayList2;
                }
            }
            TimeZone timeZone2 = He.a.f7667a;
            currentTimeMillis = System.currentTimeMillis();
            if (currentTimeMillis >= c5151c.oldestCookie) {
            }
            ArrayList arrayList3 = c5151c.f43094Y;
            ArrayList arrayList22 = new ArrayList();
            it = arrayList3.iterator();
            while (it.hasNext()) {
            }
            return arrayList22;
        } finally {
            dVar.g(null);
        }
        c5150b = new C5150b(this, abstractC4825e);
        Object obj2 = c5150b.f43091i0;
        EnumC5000a enumC5000a2 = EnumC5000a.f41328Y;
        i10 = c5150b.f43093k0;
        if (i10 == 0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0059 A[Catch: all -> 0x00ac, TryCatch #0 {all -> 0x00ac, blocks: (B:18:0x0051, B:20:0x0059, B:22:0x006f, B:25:0x007a, B:26:0x0088, B:28:0x008c, B:30:0x0092, B:31:0x009a, B:33:0x00a1, B:35:0x00a9), top: B:41:0x0051 }] */
    @Override // pe.AbstractC5152d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object n0(C6410O c6410o, C6419h c6419h, AbstractC4825e abstractC4825e) {
        C5149a c5149a;
        int i10;
        Wg.d dVar;
        C5151c c5151c;
        C6419h c6419h2;
        try {
            if (abstractC4825e instanceof C5149a) {
                c5149a = (C5149a) abstractC4825e;
                int i11 = c5149a.f43087l0;
                if ((i11 & Integer.MIN_VALUE) != 0) {
                    c5149a.f43087l0 = i11 - Integer.MIN_VALUE;
                    Object obj = c5149a.f43085j0;
                    EnumC5000a enumC5000a = EnumC5000a.f41328Y;
                    i10 = c5149a.f43087l0;
                    if (i10 == 0) {
                        if (i10 == 1) {
                            Wg.d dVar2 = c5149a.f43084i0;
                            c6419h = c5149a.f43083h0;
                            C6410O c6410o2 = c5149a.f43082Z;
                            c5151c = c5149a.f43081Y;
                            N.B0(obj);
                            dVar = dVar2;
                            c6410o = c6410o2;
                        } else {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                    } else {
                        N.B0(obj);
                        dVar = this.f43095Z;
                        c5149a.f43081Y = this;
                        c5149a.f43082Z = c6410o;
                        c5149a.f43083h0 = c6419h;
                        c5149a.f43084i0 = dVar;
                        c5149a.f43087l0 = 1;
                        if (dVar.e(null, c5149a) == enumC5000a) {
                            return enumC5000a;
                        }
                        c5151c = this;
                    }
                    if (!Lg.n.n2(c6419h.f49888a)) {
                        s.R1(new q(c6419h, c6410o, 2), c5151c.f43094Y);
                        ArrayList arrayList = c5151c.f43094Y;
                        AbstractC3557B.c0("requestUrl", c6410o);
                        String str = c6419h.f49894g;
                        if (str != null && Lg.n.I2(str, Separators.SLASH, false)) {
                            c6419h2 = c6419h;
                        } else {
                            c6419h2 = C6419h.a(c6419h, null, (String) c6410o.f49866i.getValue(), 959);
                        }
                        String str2 = c6419h2.f49893f;
                        if (str2 == null || Lg.n.n2(str2)) {
                            c6419h2 = C6419h.a(c6419h2, c6410o.f49859b, null, 991);
                        }
                        arrayList.add(c6419h2);
                        He.b bVar = c6419h.f49892e;
                        if (bVar != null) {
                            long j6 = bVar.f7676n0;
                            if (c5151c.oldestCookie > j6) {
                                c5151c.oldestCookie = j6;
                            }
                        }
                    }
                    dVar.g(null);
                    return y.f36177a;
                }
            }
            if (!Lg.n.n2(c6419h.f49888a)) {
            }
            dVar.g(null);
            return y.f36177a;
        } catch (Throwable th2) {
            dVar.g(null);
            throw th2;
        }
        c5149a = new C5149a(this, abstractC4825e);
        Object obj2 = c5149a.f43085j0;
        EnumC5000a enumC5000a2 = EnumC5000a.f41328Y;
        i10 = c5149a.f43087l0;
        if (i10 == 0) {
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }
}
