package lh;

import android.app.ActivityManager;
import android.content.Context;
import com.google.android.gms.internal.play_billing.N;
import id.AbstractC3557B;
import java.util.List;
import l8.AbstractC4344b;
import lf.C4436a;
import nf.AbstractC4825e;
import of.EnumC5000a;
import p1.AbstractC5039d;
import p1.AbstractC5042g;

/* renamed from: lh.E  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4475E implements y {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ y f38437a;

    public C4475E(y yVar) {
        this.f38437a = yVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00dd  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:35:0x00d6 -> B:36:0x00d7). Please submit an issue!!! */
    @Override // lh.y
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(z zVar, AbstractC4825e abstractC4825e) {
        C4474D c4474d;
        int i10;
        int i11;
        z zVar2;
        y yVar;
        List list;
        List list2;
        int i12;
        List list3;
        z zVar3;
        y yVar2;
        List list4;
        List list5;
        ActivityManager.MemoryInfo memoryInfo;
        int i13;
        if (abstractC4825e instanceof C4474D) {
            c4474d = (C4474D) abstractC4825e;
            int i14 = c4474d.f38436o0;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                c4474d.f38436o0 = i14 - Integer.MIN_VALUE;
                Object obj = c4474d.f38434m0;
                EnumC5000a enumC5000a = EnumC5000a.f41328Y;
                i10 = c4474d.f38436o0;
                if (i10 == 0) {
                    if (i10 != 1) {
                        if (i10 == 2) {
                            i11 = c4474d.f38433l0;
                            i12 = c4474d.f38432k0;
                            list2 = c4474d.f38431j0;
                            List list6 = c4474d.f38430i0;
                            list = c4474d.f38429h0;
                            yVar = c4474d.f38428Z;
                            zVar2 = c4474d.f38427Y;
                            N.B0(obj);
                            list2.add(obj);
                            i11++;
                            list2 = list6;
                            if (i11 >= i12) {
                                c4474d.f38427Y = zVar2;
                                c4474d.f38428Z = yVar;
                                c4474d.f38429h0 = list;
                                c4474d.f38430i0 = list2;
                                c4474d.f38431j0 = list2;
                                c4474d.f38432k0 = i12;
                                c4474d.f38433l0 = i11;
                                c4474d.f38436o0 = 2;
                                obj = yVar.a(zVar2, c4474d);
                                if (obj == enumC5000a) {
                                    return enumC5000a;
                                }
                                list6 = list2;
                                list2.add(obj);
                                i11++;
                                list2 = list6;
                                if (i11 >= i12) {
                                    C4436a Q = AbstractC4344b.Q(list);
                                    return new C4477G(((AbstractC4471A) kf.t.f2(Q)).d(), zVar2.f38525d.f38521a, new C4479I(Q));
                                }
                            }
                        } else {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                    } else {
                        list3 = c4474d.f38431j0;
                        list5 = c4474d.f38430i0;
                        list4 = c4474d.f38429h0;
                        yVar2 = c4474d.f38428Z;
                        zVar3 = c4474d.f38427Y;
                        N.B0(obj);
                    }
                } else {
                    N.B0(obj);
                    C4436a c4436a = new C4436a();
                    c4474d.f38427Y = zVar;
                    yVar2 = this.f38437a;
                    c4474d.f38428Z = yVar2;
                    c4474d.f38429h0 = c4436a;
                    c4474d.f38430i0 = c4436a;
                    c4474d.f38431j0 = c4436a;
                    c4474d.f38436o0 = 1;
                    Object a5 = yVar2.a(zVar, c4474d);
                    if (a5 == enumC5000a) {
                        return enumC5000a;
                    }
                    zVar3 = zVar;
                    list3 = c4436a;
                    list4 = list3;
                    obj = a5;
                    list5 = list4;
                }
                list3.add(obj);
                long d10 = ((AbstractC4471A) kf.t.f2(list5)).d();
                Context context = zVar3.f38522a;
                Object obj2 = AbstractC5042g.f41723a;
                Object b10 = AbstractC5039d.b(context, ActivityManager.class);
                AbstractC3557B.Z(b10);
                ActivityManager activityManager = (ActivityManager) b10;
                memoryInfo = new ActivityManager.MemoryInfo();
                activityManager.getMemoryInfo(memoryInfo);
                if (memoryInfo.lowMemory && !activityManager.isLowRamDevice() && Ad.l.w0(d10) < 2160) {
                    i13 = Runtime.getRuntime().availableProcessors();
                    if (i13 > 2) {
                        i13 = 2;
                    }
                } else {
                    i13 = 1;
                }
                yVar = yVar2;
                zVar2 = zVar3;
                list = list4;
                list2 = list5;
                i12 = i13 - 1;
                i11 = 0;
                if (i11 >= i12) {
                }
            }
        }
        c4474d = new C4474D(this, abstractC4825e);
        Object obj3 = c4474d.f38434m0;
        EnumC5000a enumC5000a2 = EnumC5000a.f41328Y;
        i10 = c4474d.f38436o0;
        if (i10 == 0) {
        }
        list3.add(obj3);
        long d102 = ((AbstractC4471A) kf.t.f2(list5)).d();
        Context context2 = zVar3.f38522a;
        Object obj22 = AbstractC5042g.f41723a;
        Object b102 = AbstractC5039d.b(context2, ActivityManager.class);
        AbstractC3557B.Z(b102);
        ActivityManager activityManager2 = (ActivityManager) b102;
        memoryInfo = new ActivityManager.MemoryInfo();
        activityManager2.getMemoryInfo(memoryInfo);
        if (memoryInfo.lowMemory) {
        }
        i13 = 1;
        yVar = yVar2;
        zVar2 = zVar3;
        list = list4;
        list2 = list5;
        i12 = i13 - 1;
        i11 = 0;
        if (i11 >= i12) {
        }
    }
}
