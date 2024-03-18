package Ii;

import android.os.Build;
import android.os.Process;
import android.os.SystemClock;
import com.statsig.androidsdk.StatsigLoggerKt;
import id.AbstractC3557B;
import jf.C3959i;

/* loaded from: classes2.dex */
public final class u extends kotlin.jvm.internal.o implements wf.k {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ long f8685Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ Hi.i f8686Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ long f8687h0;

    /* renamed from: i0  reason: collision with root package name */
    public final /* synthetic */ long f8688i0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(long j6, Hi.i iVar, long j10, long j11) {
        super(1);
        this.f8685Y = j6;
        this.f8686Z = iVar;
        this.f8687h0 = j10;
        this.f8688i0 = j11;
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0158  */
    @Override // wf.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(Object obj) {
        Hi.o oVar;
        int i10;
        C3959i c3959i;
        Long l10;
        long j6;
        String str;
        Long l11;
        Hi.o oVar2;
        C0805j c0805j = (C0805j) obj;
        AbstractC3557B.c0("launch", c0805j);
        Long l12 = v.f8696h;
        if (l12 != null) {
            if (c0805j.f8656b > l12.longValue()) {
                int ordinal = c0805j.f8660f.ordinal();
                if (ordinal != 0) {
                    if (ordinal != 1) {
                        if (ordinal == 2) {
                            oVar2 = Hi.o.ACTIVITY_WAS_STOPPED;
                        } else {
                            throw new RuntimeException();
                        }
                    } else {
                        oVar2 = Hi.o.NO_ACTIVITY_BUT_SAVED_STATE;
                    }
                } else {
                    oVar2 = Hi.o.NO_ACTIVITY_NO_SAVED_STATE;
                }
                oVar = oVar2;
                long j10 = this.f8685Y;
                Hi.i iVar = this.f8686Z;
                long j11 = this.f8687h0;
                long j12 = this.f8688i0;
                i10 = oVar.f7908Y;
                Hi.i iVar2 = Hi.i.f7879Z;
                if (i10 == 1) {
                    if (Build.VERSION.SDK_INT >= 24) {
                        j6 = Process.getStartUptimeMillis();
                        Hi.c cVar = v.f8691c;
                        if (cVar != null) {
                            Long l13 = cVar.f7851t;
                            if (l13 == null) {
                                str = "appStartData";
                            } else {
                                long longValue = l13.longValue();
                                Hi.c cVar2 = v.f8691c;
                                str = "appStartData";
                                if (cVar2 != null) {
                                    if ((longValue - cVar2.f7833b) - j6 >= StatsigLoggerKt.FLUSH_TIMER_MS) {
                                        j6 = v.f8692d;
                                    }
                                } else {
                                    AbstractC3557B.C2(str);
                                    throw null;
                                }
                            }
                        } else {
                            AbstractC3557B.C2("appStartData");
                            throw null;
                        }
                    } else {
                        str = "appStartData";
                        j6 = v.f8692d;
                    }
                    if (j10 != -1) {
                        if (iVar == iVar2) {
                            l11 = Long.valueOf((System.currentTimeMillis() - (SystemClock.uptimeMillis() - j6)) - j10);
                        } else {
                            Hi.c cVar3 = v.f8691c;
                            if (cVar3 != null) {
                                Long l14 = cVar3.f7844m;
                                if (l14 != null) {
                                    l11 = Long.valueOf(l14.longValue() - (j11 - j6));
                                }
                            } else {
                                AbstractC3557B.C2(str);
                                throw null;
                            }
                        }
                        c3959i = new C3959i(Long.valueOf(j6), l11);
                    }
                    l11 = null;
                    c3959i = new C3959i(Long.valueOf(j6), l11);
                } else {
                    long j13 = c0805j.f8656b;
                    Long l15 = c0805j.f8659e;
                    if (l15 == null) {
                        if (j10 != -1) {
                            if (iVar == iVar2) {
                                l10 = Long.valueOf((System.currentTimeMillis() - (SystemClock.uptimeMillis() - j13)) - j10);
                            } else {
                                Hi.c cVar4 = v.f8691c;
                                if (cVar4 != null) {
                                    Long l16 = cVar4.f7844m;
                                    if (l16 != null) {
                                        l10 = Long.valueOf((c0805j.f8657c - j12) + l16.longValue());
                                    }
                                } else {
                                    AbstractC3557B.C2("appStartData");
                                    throw null;
                                }
                            }
                        }
                        l10 = null;
                    } else {
                        l10 = l15;
                    }
                    c3959i = new C3959i(Long.valueOf(c0805j.f8656b), l10);
                }
                long longValue2 = ((Number) c3959i.f36155Y).longValue();
                Long l17 = (Long) c3959i.f36156Z;
                if (v.f8689a) {
                    Hi.q.c("App Launch", 0);
                    v.f8689a = false;
                }
                Hi.m mVar = Hi.n.f7898a;
                Hi.k kVar = new Hi.k(oVar, c0805j.f8658d - longValue2, c0805j.f8655a, l17, longValue2);
                mVar.getClass();
                Hi.m.a(kVar);
                return jf.y.f36177a;
            }
        }
        Hi.c cVar5 = v.f8691c;
        if (cVar5 != null) {
            if (cVar5.f7837f == 100) {
                Hi.c cVar6 = v.f8691c;
                if (cVar6 != null) {
                    AbstractC3557B abstractC3557B = cVar6.f7849r;
                    boolean z10 = abstractC3557B instanceof Hi.g;
                    Hi.o oVar3 = Hi.o.NO_PROCESS;
                    if (z10) {
                        int ordinal2 = ((Hi.g) abstractC3557B).f7864h.ordinal();
                        if (ordinal2 != 0) {
                            if (ordinal2 != 1) {
                                if (ordinal2 != 2) {
                                    if (ordinal2 != 3) {
                                        throw new RuntimeException();
                                    }
                                } else {
                                    oVar2 = Hi.o.NO_PROCESS_FIRST_LAUNCH_AFTER_UPGRADE;
                                }
                            } else {
                                oVar2 = Hi.o.NO_PROCESS_FIRST_LAUNCH_AFTER_INSTALL;
                            }
                        } else {
                            oVar2 = Hi.o.NO_PROCESS_FIRST_LAUNCH_AFTER_CLEAR_DATA;
                        }
                    }
                    oVar = oVar3;
                    long j102 = this.f8685Y;
                    Hi.i iVar3 = this.f8686Z;
                    long j112 = this.f8687h0;
                    long j122 = this.f8688i0;
                    i10 = oVar.f7908Y;
                    Hi.i iVar22 = Hi.i.f7879Z;
                    if (i10 == 1) {
                    }
                    long longValue22 = ((Number) c3959i.f36155Y).longValue();
                    Long l172 = (Long) c3959i.f36156Z;
                    if (v.f8689a) {
                    }
                    Hi.m mVar2 = Hi.n.f7898a;
                    Hi.k kVar2 = new Hi.k(oVar, c0805j.f8658d - longValue22, c0805j.f8655a, l172, longValue22);
                    mVar2.getClass();
                    Hi.m.a(kVar2);
                    return jf.y.f36177a;
                }
                AbstractC3557B.C2("appStartData");
                throw null;
            }
            oVar2 = Hi.o.PROCESS_WAS_LAUNCHING_IN_BACKGROUND;
            oVar = oVar2;
            long j1022 = this.f8685Y;
            Hi.i iVar32 = this.f8686Z;
            long j1122 = this.f8687h0;
            long j1222 = this.f8688i0;
            i10 = oVar.f7908Y;
            Hi.i iVar222 = Hi.i.f7879Z;
            if (i10 == 1) {
            }
            long longValue222 = ((Number) c3959i.f36155Y).longValue();
            Long l1722 = (Long) c3959i.f36156Z;
            if (v.f8689a) {
            }
            Hi.m mVar22 = Hi.n.f7898a;
            Hi.k kVar22 = new Hi.k(oVar, c0805j.f8658d - longValue222, c0805j.f8655a, l1722, longValue222);
            mVar22.getClass();
            Hi.m.a(kVar22);
            return jf.y.f36177a;
        }
        AbstractC3557B.C2("appStartData");
        throw null;
    }
}
