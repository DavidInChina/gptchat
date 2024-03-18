package androidx.work.impl.workers;

import A7.b;
import L3.C0892d;
import L3.g;
import L3.p;
import M3.F;
import U3.i;
import U3.l;
import U3.q;
import U3.s;
import U3.u;
import android.content.Context;
import android.database.Cursor;
import android.gov.nist.javax.sip.header.ParameterNames;
import androidx.work.Worker;
import androidx.work.WorkerParameters;
import androidx.work.impl.WorkDatabase;
import id.AbstractC3557B;
import io.sentry.L0;
import io.sentry.S;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import x3.C6270B;
import x3.y;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u00a2\u0006\u0004\b\u0006\u0010\u0007\u00a8\u0006\b"}, d2 = {"Landroidx/work/impl/workers/DiagnosticsWorker;", "Landroidx/work/Worker;", "Landroid/content/Context;", "context", "Landroidx/work/WorkerParameters;", "parameters", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V", "work-runtime_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class DiagnosticsWorker extends Worker {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DiagnosticsWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        AbstractC3557B.c0("context", context);
        AbstractC3557B.c0("parameters", workerParameters);
    }

    @Override // androidx.work.Worker
    public final p f() {
        S s10;
        S s11;
        C6270B c6270b;
        Throwable th2;
        int m02;
        int m03;
        int m04;
        int m05;
        int m06;
        int m07;
        int m08;
        int m09;
        int m010;
        int m011;
        int m012;
        int m013;
        int m014;
        int m015;
        i iVar;
        u uVar;
        l lVar;
        String str;
        String str2;
        String str3;
        byte[] bArr;
        byte[] bArr2;
        boolean z10;
        int i10;
        boolean z11;
        int i11;
        boolean z12;
        int i12;
        boolean z13;
        int i13;
        boolean z14;
        int i14;
        byte[] bArr3;
        F g02 = F.g0(this.f10725Y);
        WorkDatabase workDatabase = g02.f11519h;
        AbstractC3557B.b0("workManager.workDatabase", workDatabase);
        s u10 = workDatabase.u();
        l s12 = workDatabase.s();
        u v10 = workDatabase.v();
        i r10 = workDatabase.r();
        g02.f11518g.f10686c.getClass();
        long currentTimeMillis = System.currentTimeMillis() - TimeUnit.DAYS.toMillis(1L);
        u10.getClass();
        S d10 = L0.d();
        if (d10 != null) {
            s10 = d10.v("db.sql.room", "androidx.work.impl.model.WorkSpecDao");
        } else {
            s10 = null;
        }
        C6270B a5 = C6270B.a(1, "SELECT * FROM workspec WHERE last_enqueue_time >= ? AND state IN (2, 3, 5) ORDER BY last_enqueue_time DESC");
        a5.T(1, currentTimeMillis);
        y yVar = u10.f17474a;
        yVar.b();
        Cursor t12 = b.t1(yVar, a5, false);
        try {
            m02 = r9.y.m0(t12, ParameterNames.ID);
            m03 = r9.y.m0(t12, "state");
            m04 = r9.y.m0(t12, "worker_class_name");
            m05 = r9.y.m0(t12, "input_merger_class_name");
            m06 = r9.y.m0(t12, "input");
            m07 = r9.y.m0(t12, "output");
            m08 = r9.y.m0(t12, "initial_delay");
            m09 = r9.y.m0(t12, "interval_duration");
            m010 = r9.y.m0(t12, "flex_duration");
            m011 = r9.y.m0(t12, "run_attempt_count");
            m012 = r9.y.m0(t12, "backoff_policy");
            m013 = r9.y.m0(t12, "backoff_delay_duration");
            m014 = r9.y.m0(t12, "last_enqueue_time");
            c6270b = a5;
            try {
                m015 = r9.y.m0(t12, "minimum_retention_duration");
                s11 = s10;
            } catch (Throwable th3) {
                th2 = th3;
                s11 = s10;
            }
        } catch (Throwable th4) {
            th2 = th4;
            s11 = s10;
            c6270b = a5;
        }
        try {
            int m016 = r9.y.m0(t12, "schedule_requested_at");
            int m017 = r9.y.m0(t12, "run_in_foreground");
            int m018 = r9.y.m0(t12, "out_of_quota_policy");
            int m019 = r9.y.m0(t12, "period_count");
            int m020 = r9.y.m0(t12, "generation");
            int m021 = r9.y.m0(t12, "next_schedule_time_override");
            int m022 = r9.y.m0(t12, "next_schedule_time_override_generation");
            int m023 = r9.y.m0(t12, "stop_reason");
            int m024 = r9.y.m0(t12, "required_network_type");
            int m025 = r9.y.m0(t12, "requires_charging");
            int m026 = r9.y.m0(t12, "requires_device_idle");
            int m027 = r9.y.m0(t12, "requires_battery_not_low");
            int m028 = r9.y.m0(t12, "requires_storage_not_low");
            int m029 = r9.y.m0(t12, "trigger_content_update_delay");
            int m030 = r9.y.m0(t12, "trigger_max_content_delay");
            int m031 = r9.y.m0(t12, "content_uri_triggers");
            int i15 = m015;
            ArrayList arrayList = new ArrayList(t12.getCount());
            while (t12.moveToNext()) {
                if (t12.isNull(m02)) {
                    str = null;
                } else {
                    str = t12.getString(m02);
                }
                int e12 = b.e1(t12.getInt(m03));
                if (t12.isNull(m04)) {
                    str2 = null;
                } else {
                    str2 = t12.getString(m04);
                }
                if (t12.isNull(m05)) {
                    str3 = null;
                } else {
                    str3 = t12.getString(m05);
                }
                if (t12.isNull(m06)) {
                    bArr = null;
                } else {
                    bArr = t12.getBlob(m06);
                }
                g a10 = g.a(bArr);
                if (t12.isNull(m07)) {
                    bArr2 = null;
                } else {
                    bArr2 = t12.getBlob(m07);
                }
                g a11 = g.a(bArr2);
                long j6 = t12.getLong(m08);
                long j10 = t12.getLong(m09);
                long j11 = t12.getLong(m010);
                int i16 = t12.getInt(m011);
                int b1 = b.b1(t12.getInt(m012));
                long j12 = t12.getLong(m013);
                long j13 = t12.getLong(m014);
                int i17 = i15;
                long j14 = t12.getLong(i17);
                int i18 = m09;
                int i19 = m016;
                long j15 = t12.getLong(i19);
                m016 = i19;
                int i20 = m017;
                if (t12.getInt(i20) != 0) {
                    m017 = i20;
                    i10 = m018;
                    z10 = true;
                } else {
                    m017 = i20;
                    i10 = m018;
                    z10 = false;
                }
                int d12 = b.d1(t12.getInt(i10));
                m018 = i10;
                int i21 = m019;
                int i22 = t12.getInt(i21);
                m019 = i21;
                int i23 = m020;
                int i24 = t12.getInt(i23);
                m020 = i23;
                int i25 = m021;
                long j16 = t12.getLong(i25);
                m021 = i25;
                int i26 = m022;
                int i27 = t12.getInt(i26);
                m022 = i26;
                int i28 = m023;
                int i29 = t12.getInt(i28);
                m023 = i28;
                int i30 = m024;
                int c12 = b.c1(t12.getInt(i30));
                m024 = i30;
                int i31 = m025;
                if (t12.getInt(i31) != 0) {
                    m025 = i31;
                    i11 = m026;
                    z11 = true;
                } else {
                    m025 = i31;
                    i11 = m026;
                    z11 = false;
                }
                if (t12.getInt(i11) != 0) {
                    m026 = i11;
                    i12 = m027;
                    z12 = true;
                } else {
                    m026 = i11;
                    i12 = m027;
                    z12 = false;
                }
                if (t12.getInt(i12) != 0) {
                    m027 = i12;
                    i13 = m028;
                    z13 = true;
                } else {
                    m027 = i12;
                    i13 = m028;
                    z13 = false;
                }
                if (t12.getInt(i13) != 0) {
                    m028 = i13;
                    i14 = m029;
                    z14 = true;
                } else {
                    m028 = i13;
                    i14 = m029;
                    z14 = false;
                }
                long j17 = t12.getLong(i14);
                m029 = i14;
                int i32 = m030;
                long j18 = t12.getLong(i32);
                m030 = i32;
                int i33 = m031;
                if (t12.isNull(i33)) {
                    bArr3 = null;
                } else {
                    bArr3 = t12.getBlob(i33);
                }
                m031 = i33;
                arrayList.add(new q(str, e12, str2, str3, a10, a11, j6, j10, j11, new C0892d(c12, z11, z12, z13, z14, j17, j18, b.e0(bArr3)), i16, b1, j12, j13, j14, j15, z10, d12, i22, i24, j16, i27, i29));
                m09 = i18;
                i15 = i17;
            }
            t12.close();
            if (s11 != null) {
                s11.b();
            }
            c6270b.j();
            ArrayList g10 = u10.g();
            ArrayList d11 = u10.d();
            if (!arrayList.isEmpty()) {
                L3.s d13 = L3.s.d();
                String str4 = Y3.b.f22099a;
                d13.e(str4, "Recently completed work:\n\n");
                iVar = r10;
                lVar = s12;
                uVar = v10;
                L3.s.d().e(str4, Y3.b.a(lVar, uVar, iVar, arrayList));
            } else {
                iVar = r10;
                lVar = s12;
                uVar = v10;
            }
            if (!g10.isEmpty()) {
                L3.s d14 = L3.s.d();
                String str5 = Y3.b.f22099a;
                d14.e(str5, "Running work:\n\n");
                L3.s.d().e(str5, Y3.b.a(lVar, uVar, iVar, g10));
            }
            if (!d11.isEmpty()) {
                L3.s d15 = L3.s.d();
                String str6 = Y3.b.f22099a;
                d15.e(str6, "Enqueued work:\n\n");
                L3.s.d().e(str6, Y3.b.a(lVar, uVar, iVar, d11));
            }
            return new p(g.f10714c);
        } catch (Throwable th5) {
            th2 = th5;
            t12.close();
            if (s11 != null) {
                s11.b();
            }
            c6270b.j();
            throw th2;
        }
    }
}
