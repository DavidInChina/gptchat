package P3;

import E9.f;
import L3.C0889a;
import L3.C0891c;
import L3.C0892d;
import M3.s;
import U3.g;
import U3.i;
import U3.j;
import U3.q;
import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.gov.nist.core.Separators;
import android.net.NetworkRequest;
import android.os.Build;
import android.os.PersistableBundle;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.background.systemjob.SystemJobService;
import id.AbstractC3557B;
import io.sentry.C1;
import io.sentry.L0;
import io.sentry.S;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.Callable;
import p.AbstractC5028d;
import x3.y;
import z.AbstractC6708l;

/* loaded from: classes.dex */
public final class b implements s {

    /* renamed from: k0  reason: collision with root package name */
    public static final String f13804k0 = L3.s.f("SystemJobScheduler");

    /* renamed from: Y  reason: collision with root package name */
    public final Context f13805Y;

    /* renamed from: Z  reason: collision with root package name */
    public final JobScheduler f13806Z;

    /* renamed from: h0  reason: collision with root package name */
    public final a f13807h0;

    /* renamed from: i0  reason: collision with root package name */
    public final WorkDatabase f13808i0;

    /* renamed from: j0  reason: collision with root package name */
    public final C0889a f13809j0;

    public b(Context context, WorkDatabase workDatabase, C0889a c0889a) {
        a aVar = new a(context, c0889a.f10686c);
        this.f13805Y = context;
        this.f13806Z = (JobScheduler) context.getSystemService("jobscheduler");
        this.f13807h0 = aVar;
        this.f13808i0 = workDatabase;
        this.f13809j0 = c0889a;
    }

    public static void a(JobScheduler jobScheduler, int i10) {
        try {
            jobScheduler.cancel(i10);
        } catch (Throwable th2) {
            L3.s.d().c(f13804k0, String.format(Locale.getDefault(), "Exception while trying to cancel job (%d)", Integer.valueOf(i10)), th2);
        }
    }

    public static ArrayList e(Context context, JobScheduler jobScheduler, String str) {
        ArrayList f6 = f(context, jobScheduler);
        if (f6 == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(2);
        Iterator it = f6.iterator();
        while (it.hasNext()) {
            JobInfo jobInfo = (JobInfo) it.next();
            j g10 = g(jobInfo);
            if (g10 != null && str.equals(g10.f17418a)) {
                arrayList.add(Integer.valueOf(jobInfo.getId()));
            }
        }
        return arrayList;
    }

    public static ArrayList f(Context context, JobScheduler jobScheduler) {
        List<JobInfo> list;
        try {
            list = jobScheduler.getAllPendingJobs();
        } catch (Throwable th2) {
            L3.s.d().c(f13804k0, "getAllPendingJobs() is not reliable on this device.", th2);
            list = null;
        }
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(list.size());
        ComponentName componentName = new ComponentName(context, SystemJobService.class);
        for (JobInfo jobInfo : list) {
            if (componentName.equals(jobInfo.getService())) {
                arrayList.add(jobInfo);
            }
        }
        return arrayList;
    }

    public static j g(JobInfo jobInfo) {
        PersistableBundle extras = jobInfo.getExtras();
        if (extras != null) {
            try {
                if (extras.containsKey("EXTRA_WORK_SPEC_ID")) {
                    return new j(extras.getString("EXTRA_WORK_SPEC_ID"), extras.getInt("EXTRA_WORK_SPEC_GENERATION", 0));
                }
                return null;
            } catch (NullPointerException unused) {
                return null;
            }
        }
        return null;
    }

    @Override // M3.s
    public final boolean b() {
        return true;
    }

    @Override // M3.s
    public final void c(String str) {
        S s10;
        Context context = this.f13805Y;
        JobScheduler jobScheduler = this.f13806Z;
        ArrayList e10 = e(context, jobScheduler, str);
        if (e10 != null && !e10.isEmpty()) {
            Iterator it = e10.iterator();
            while (it.hasNext()) {
                a(jobScheduler, ((Integer) it.next()).intValue());
            }
            i r10 = this.f13808i0.r();
            r10.getClass();
            S d10 = L0.d();
            if (d10 != null) {
                s10 = d10.v("db.sql.room", "androidx.work.impl.model.SystemIdInfoDao");
            } else {
                s10 = null;
            }
            ((y) r10.f17414Y).b();
            B3.i c10 = ((AbstractC5028d) r10.f17417i0).c();
            if (str == null) {
                c10.s0(1);
            } else {
                c10.b(1, str);
            }
            ((y) r10.f17414Y).c();
            try {
                c10.w();
                ((y) r10.f17414Y).n();
                if (s10 != null) {
                    s10.c(C1.OK);
                }
            } finally {
                ((y) r10.f17414Y).j();
                if (s10 != null) {
                    s10.b();
                }
                ((AbstractC5028d) r10.f17417i0).g(c10);
            }
        }
    }

    @Override // M3.s
    public final void d(q... qVarArr) {
        int i10;
        ArrayList e10;
        int i11;
        WorkDatabase workDatabase = this.f13808i0;
        final F4.a aVar = new F4.a(workDatabase);
        for (q qVar : qVarArr) {
            workDatabase.c();
            try {
                q l10 = workDatabase.u().l(qVar.f17450a);
                String str = f13804k0;
                String str2 = qVar.f17450a;
                if (l10 == null) {
                    L3.s.d().g(str, "Skipping scheduling " + str2 + " because it's no longer in the DB");
                    workDatabase.n();
                } else if (l10.f17451b != 1) {
                    L3.s.d().g(str, "Skipping scheduling " + str2 + " because it is no longer enqueued");
                    workDatabase.n();
                } else {
                    j y10 = Gi.e.y(qVar);
                    g B10 = workDatabase.r().B(y10);
                    C0889a c0889a = this.f13809j0;
                    if (B10 != null) {
                        i10 = B10.f17410c;
                    } else {
                        c0889a.getClass();
                        final int i12 = c0889a.f10691h;
                        Object m10 = ((WorkDatabase) aVar.f5033Z).m(new Callable() { // from class: V3.h

                            /* renamed from: b  reason: collision with root package name */
                            public final /* synthetic */ int f18352b = 0;

                            @Override // java.util.concurrent.Callable
                            public final Object call() {
                                int i13;
                                F4.a aVar2 = F4.a.this;
                                AbstractC3557B.c0("this$0", aVar2);
                                WorkDatabase workDatabase2 = (WorkDatabase) aVar2.f5033Z;
                                Long w10 = workDatabase2.q().w("next_job_scheduler_id");
                                int i14 = 0;
                                if (w10 != null) {
                                    i13 = (int) w10.longValue();
                                } else {
                                    i13 = 0;
                                }
                                if (i13 != Integer.MAX_VALUE) {
                                    i14 = i13 + 1;
                                }
                                workDatabase2.q().x(new U3.d("next_job_scheduler_id", Long.valueOf(i14)));
                                int i15 = this.f18352b;
                                if (i15 > i13 || i13 > i12) {
                                    ((WorkDatabase) aVar2.f5033Z).q().x(new U3.d("next_job_scheduler_id", Long.valueOf(i15 + 1)));
                                    i13 = i15;
                                }
                                return Integer.valueOf(i13);
                            }
                        });
                        AbstractC3557B.b0("workDatabase.runInTransa\u2026            id\n        })", m10);
                        i10 = ((Number) m10).intValue();
                    }
                    if (B10 == null) {
                        workDatabase.r().C(new g(y10.f17418a, y10.f17419b, i10));
                    }
                    h(qVar, i10);
                    if (Build.VERSION.SDK_INT == 23 && (e10 = e(this.f13805Y, this.f13806Z, str2)) != null) {
                        int indexOf = e10.indexOf(Integer.valueOf(i10));
                        if (indexOf >= 0) {
                            e10.remove(indexOf);
                        }
                        if (!e10.isEmpty()) {
                            i11 = ((Integer) e10.get(0)).intValue();
                        } else {
                            c0889a.getClass();
                            final int i13 = c0889a.f10691h;
                            Object m11 = ((WorkDatabase) aVar.f5033Z).m(new Callable() { // from class: V3.h

                                /* renamed from: b  reason: collision with root package name */
                                public final /* synthetic */ int f18352b = 0;

                                @Override // java.util.concurrent.Callable
                                public final Object call() {
                                    int i132;
                                    F4.a aVar2 = F4.a.this;
                                    AbstractC3557B.c0("this$0", aVar2);
                                    WorkDatabase workDatabase2 = (WorkDatabase) aVar2.f5033Z;
                                    Long w10 = workDatabase2.q().w("next_job_scheduler_id");
                                    int i14 = 0;
                                    if (w10 != null) {
                                        i132 = (int) w10.longValue();
                                    } else {
                                        i132 = 0;
                                    }
                                    if (i132 != Integer.MAX_VALUE) {
                                        i14 = i132 + 1;
                                    }
                                    workDatabase2.q().x(new U3.d("next_job_scheduler_id", Long.valueOf(i14)));
                                    int i15 = this.f18352b;
                                    if (i15 > i132 || i132 > i13) {
                                        ((WorkDatabase) aVar2.f5033Z).q().x(new U3.d("next_job_scheduler_id", Long.valueOf(i15 + 1)));
                                        i132 = i15;
                                    }
                                    return Integer.valueOf(i132);
                                }
                            });
                            AbstractC3557B.b0("workDatabase.runInTransa\u2026            id\n        })", m11);
                            i11 = ((Number) m11).intValue();
                        }
                        h(qVar, i11);
                    }
                    workDatabase.n();
                }
            } finally {
                workDatabase.j();
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0075, code lost:
        if (r11 < 26) goto L18;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void h(q qVar, int i10) {
        boolean z10;
        boolean z11;
        int i11;
        int i12;
        int i13;
        JobScheduler jobScheduler = this.f13806Z;
        a aVar = this.f13807h0;
        aVar.getClass();
        C0892d c0892d = qVar.f17459j;
        PersistableBundle persistableBundle = new PersistableBundle();
        String str = qVar.f17450a;
        persistableBundle.putString("EXTRA_WORK_SPEC_ID", str);
        persistableBundle.putInt("EXTRA_WORK_SPEC_GENERATION", qVar.f17469t);
        persistableBundle.putBoolean("EXTRA_IS_PERIODIC", qVar.c());
        JobInfo.Builder requiresCharging = new JobInfo.Builder(i10, aVar.f13802a).setRequiresCharging(c0892d.f10700b);
        boolean z12 = c0892d.f10701c;
        JobInfo.Builder extras = requiresCharging.setRequiresDeviceIdle(z12).setExtras(persistableBundle);
        int i14 = Build.VERSION.SDK_INT;
        int i15 = c0892d.f10699a;
        if (i14 >= 30 && i15 == 6) {
            extras.setRequiredNetwork(new NetworkRequest.Builder().addCapability(25).build());
        } else {
            int f6 = AbstractC6708l.f(i15);
            if (f6 != 0) {
                if (f6 != 1) {
                    if (f6 != 2) {
                        if (f6 != 3) {
                            i13 = 4;
                            if (f6 == 4) {
                            }
                            L3.s.d().a(a.f13801c, "API version too low. Cannot convert network type value ".concat(f.Q(i15)));
                        } else {
                            if (i14 >= 24) {
                                i13 = 3;
                            }
                            L3.s.d().a(a.f13801c, "API version too low. Cannot convert network type value ".concat(f.Q(i15)));
                        }
                    } else {
                        i13 = 2;
                    }
                }
                i13 = 1;
            } else {
                i13 = 0;
            }
            extras.setRequiredNetworkType(i13);
        }
        if (!z12) {
            if (qVar.f17461l == 2) {
                i12 = 0;
            } else {
                i12 = 1;
            }
            extras.setBackoffCriteria(qVar.f17462m, i12);
        }
        long a5 = qVar.a();
        aVar.f13803b.getClass();
        long max = Math.max(a5 - System.currentTimeMillis(), 0L);
        if (i14 <= 28) {
            extras.setMinimumLatency(max);
        } else if (max > 0) {
            extras.setMinimumLatency(max);
        } else if (!qVar.f17466q) {
            extras.setImportantWhileForeground(true);
        }
        if (i14 >= 24 && c0892d.a()) {
            for (C0891c c0891c : c0892d.f10706h) {
                boolean z13 = c0891c.f10697b;
                B1.g.B();
                extras.addTriggerContentUri(B1.g.b(c0891c.f10696a, z13 ? 1 : 0));
            }
            extras.setTriggerContentUpdateDelay(c0892d.f10704f);
            extras.setTriggerContentMaxDelay(c0892d.f10705g);
        }
        extras.setPersisted(false);
        int i16 = Build.VERSION.SDK_INT;
        if (i16 >= 26) {
            extras.setRequiresBatteryNotLow(c0892d.f10702d);
            extras.setRequiresStorageNotLow(c0892d.f10703e);
        }
        if (qVar.f17460k > 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (max > 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (i16 >= 31 && qVar.f17466q && !z10 && !z11) {
            extras.setExpedited(true);
        }
        JobInfo build = extras.build();
        String str2 = f13804k0;
        L3.s.d().a(str2, "Scheduling work ID " + str + "Job ID " + i10);
        try {
            if (jobScheduler.schedule(build) == 0) {
                L3.s.d().g(str2, "Unable to schedule work ID " + str);
                if (qVar.f17466q && qVar.f17467r == 1) {
                    qVar.f17466q = false;
                    L3.s.d().a(str2, "Scheduling a non-expedited job (work ID " + str + Separators.RPAREN);
                    h(qVar, i10);
                }
            }
        } catch (IllegalStateException e10) {
            ArrayList f10 = f(this.f13805Y, jobScheduler);
            if (f10 != null) {
                i11 = f10.size();
            } else {
                i11 = 0;
            }
            String format = String.format(Locale.getDefault(), "JobScheduler 100 job limit exceeded.  We count %d WorkManager jobs in JobScheduler; we have %d tracked jobs in our DB; our Configuration limit is %d.", Integer.valueOf(i11), Integer.valueOf(this.f13808i0.u().h().size()), Integer.valueOf(this.f13809j0.f10693j));
            L3.s.d().b(str2, format);
            throw new IllegalStateException(format, e10);
        } catch (Throwable th2) {
            L3.s.d().c(str2, "Unable to schedule " + qVar, th2);
        }
    }
}
