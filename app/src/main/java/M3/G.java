package M3;

import L3.C0889a;
import android.content.Context;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.background.systemjob.SystemJobService;
import id.AbstractC3557B;
import l8.AbstractC4344b;

/* loaded from: classes2.dex */
public final /* synthetic */ class G extends kotlin.jvm.internal.k implements wf.r {

    /* renamed from: Y  reason: collision with root package name */
    public static final G f11527Y = new kotlin.jvm.internal.k(6, H.class, "createSchedulers", "createSchedulers(Landroid/content/Context;Landroidx/work/Configuration;Landroidx/work/impl/utils/taskexecutor/TaskExecutor;Landroidx/work/impl/WorkDatabase;Landroidx/work/impl/constraints/trackers/Trackers;Landroidx/work/impl/Processor;)Ljava/util/List;", 1);

    @Override // wf.r
    public final Object k(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        Context context = (Context) obj;
        C0889a c0889a = (C0889a) obj2;
        X3.b bVar = (X3.b) obj3;
        WorkDatabase workDatabase = (WorkDatabase) obj4;
        S3.m mVar = (S3.m) obj5;
        q qVar = (q) obj6;
        AbstractC3557B.c0("p0", context);
        AbstractC3557B.c0("p1", c0889a);
        AbstractC3557B.c0("p2", bVar);
        AbstractC3557B.c0("p3", workDatabase);
        AbstractC3557B.c0("p4", mVar);
        AbstractC3557B.c0("p5", qVar);
        String str = v.f11606a;
        P3.b bVar2 = new P3.b(context, workDatabase, c0889a);
        V3.l.a(context, SystemJobService.class, true);
        L3.s.d().a(v.f11606a, "Created SystemJobScheduler and enabled SystemJobService");
        return AbstractC4344b.G0(bVar2, new N3.c(context, c0889a, mVar, qVar, new D(qVar, bVar), bVar));
    }
}
