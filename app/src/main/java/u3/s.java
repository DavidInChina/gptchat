package U3;

import L3.C0892d;
import android.database.Cursor;
import android.gov.nist.core.Separators;
import android.gov.nist.javax.sip.header.ParameterNames;
import com.revenuecat.purchases.common.networking.RCHTTPStatusCodes;
import id.AbstractC3557B;
import io.sentry.C1;
import io.sentry.L0;
import io.sentry.S;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;
import x3.C6270B;
import x3.y;

/* loaded from: classes.dex */
public final class s {

    /* renamed from: a  reason: collision with root package name */
    public final y f17474a;

    /* renamed from: b  reason: collision with root package name */
    public final b f17475b;

    /* renamed from: c  reason: collision with root package name */
    public final r f17476c;

    /* renamed from: d  reason: collision with root package name */
    public final r f17477d;

    /* renamed from: e  reason: collision with root package name */
    public final r f17478e;

    /* renamed from: f  reason: collision with root package name */
    public final r f17479f;

    /* renamed from: g  reason: collision with root package name */
    public final r f17480g;

    /* renamed from: h  reason: collision with root package name */
    public final r f17481h;

    /* renamed from: i  reason: collision with root package name */
    public final r f17482i;

    /* renamed from: j  reason: collision with root package name */
    public final r f17483j;

    /* renamed from: k  reason: collision with root package name */
    public final r f17484k;

    /* renamed from: l  reason: collision with root package name */
    public final r f17485l;

    /* renamed from: m  reason: collision with root package name */
    public final r f17486m;

    /* renamed from: n  reason: collision with root package name */
    public final r f17487n;

    public s(y yVar) {
        this.f17474a = yVar;
        this.f17475b = new b(this, yVar, 5);
        new r(yVar);
        this.f17476c = new r(yVar, 9);
        this.f17477d = new r(yVar, 10);
        this.f17478e = new r(yVar, 11);
        this.f17479f = new r(yVar, 12);
        this.f17480g = new r(yVar, 13);
        this.f17481h = new r(yVar, 14);
        this.f17482i = new r(yVar, 15);
        this.f17483j = new r(yVar, 0);
        new r(yVar, 1);
        this.f17484k = new r(yVar, 2);
        this.f17485l = new r(yVar, 3);
        this.f17486m = new r(yVar, 4);
        new r(yVar, 5);
        new r(yVar, 6);
        this.f17487n = new r(yVar, 7);
    }

    public final void a(HashMap hashMap) {
        byte[] bArr;
        int i10;
        Set<String> keySet = hashMap.keySet();
        if (keySet.isEmpty()) {
            return;
        }
        if (hashMap.size() > 999) {
            HashMap hashMap2 = new HashMap(999);
            loop0: while (true) {
                i10 = 0;
                for (String str : keySet) {
                    hashMap2.put(str, (ArrayList) hashMap.get(str));
                    i10++;
                    if (i10 == 999) {
                        break;
                    }
                }
                a(hashMap2);
                hashMap2 = new HashMap(999);
            }
            if (i10 > 0) {
                a(hashMap2);
                return;
            }
            return;
        }
        StringBuilder p10 = android.gov.nist.core.a.p("SELECT `progress`,`work_spec_id` FROM `WorkProgress` WHERE `work_spec_id` IN (");
        int size = keySet.size();
        r9.y.U(size, p10);
        p10.append(Separators.RPAREN);
        C6270B a5 = C6270B.a(size, p10.toString());
        int i11 = 1;
        for (String str2 : keySet) {
            if (str2 == null) {
                a5.s0(i11);
            } else {
                a5.b(i11, str2);
            }
            i11++;
        }
        Cursor t12 = A7.b.t1(this.f17474a, a5, false);
        try {
            int l02 = r9.y.l0(t12, "work_spec_id");
            if (l02 == -1) {
                return;
            }
            while (t12.moveToNext()) {
                ArrayList arrayList = (ArrayList) hashMap.get(t12.getString(l02));
                if (arrayList != null) {
                    if (t12.isNull(0)) {
                        bArr = null;
                    } else {
                        bArr = t12.getBlob(0);
                    }
                    arrayList.add(L3.g.a(bArr));
                }
            }
        } finally {
            t12.close();
        }
    }

    public final void b(HashMap hashMap) {
        String str;
        int i10;
        Set<String> keySet = hashMap.keySet();
        if (keySet.isEmpty()) {
            return;
        }
        if (hashMap.size() > 999) {
            HashMap hashMap2 = new HashMap(999);
            loop0: while (true) {
                i10 = 0;
                for (String str2 : keySet) {
                    hashMap2.put(str2, (ArrayList) hashMap.get(str2));
                    i10++;
                    if (i10 == 999) {
                        break;
                    }
                }
                b(hashMap2);
                hashMap2 = new HashMap(999);
            }
            if (i10 > 0) {
                b(hashMap2);
                return;
            }
            return;
        }
        StringBuilder p10 = android.gov.nist.core.a.p("SELECT `tag`,`work_spec_id` FROM `WorkTag` WHERE `work_spec_id` IN (");
        int size = keySet.size();
        r9.y.U(size, p10);
        p10.append(Separators.RPAREN);
        C6270B a5 = C6270B.a(size, p10.toString());
        int i11 = 1;
        for (String str3 : keySet) {
            if (str3 == null) {
                a5.s0(i11);
            } else {
                a5.b(i11, str3);
            }
            i11++;
        }
        Cursor t12 = A7.b.t1(this.f17474a, a5, false);
        try {
            int l02 = r9.y.l0(t12, "work_spec_id");
            if (l02 == -1) {
                return;
            }
            while (t12.moveToNext()) {
                ArrayList arrayList = (ArrayList) hashMap.get(t12.getString(l02));
                if (arrayList != null) {
                    if (t12.isNull(0)) {
                        str = null;
                    } else {
                        str = t12.getString(0);
                    }
                    arrayList.add(str);
                }
            }
        } finally {
            t12.close();
        }
    }

    public final void c(String str) {
        S s10;
        S d10 = L0.d();
        if (d10 != null) {
            s10 = d10.v("db.sql.room", "androidx.work.impl.model.WorkSpecDao");
        } else {
            s10 = null;
        }
        y yVar = this.f17474a;
        yVar.b();
        r rVar = this.f17476c;
        B3.i c10 = rVar.c();
        if (str == null) {
            c10.s0(1);
        } else {
            c10.b(1, str);
        }
        yVar.c();
        try {
            c10.w();
            yVar.n();
            if (s10 != null) {
                s10.c(C1.OK);
            }
        } finally {
            yVar.j();
            if (s10 != null) {
                s10.b();
            }
            rVar.g(c10);
        }
    }

    public final ArrayList d() {
        S s10;
        S s11;
        C6270B c6270b;
        Throwable th2;
        int m02;
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
        S d10 = L0.d();
        if (d10 != null) {
            s10 = d10.v("db.sql.room", "androidx.work.impl.model.WorkSpecDao");
        } else {
            s10 = null;
        }
        C6270B a5 = C6270B.a(1, "SELECT * FROM workspec WHERE state=0 ORDER BY last_enqueue_time LIMIT ?");
        a5.T(1, (long) RCHTTPStatusCodes.SUCCESS);
        y yVar = this.f17474a;
        yVar.b();
        Cursor t12 = A7.b.t1(yVar, a5, false);
        try {
            int m03 = r9.y.m0(t12, ParameterNames.ID);
            int m04 = r9.y.m0(t12, "state");
            int m05 = r9.y.m0(t12, "worker_class_name");
            int m06 = r9.y.m0(t12, "input_merger_class_name");
            int m07 = r9.y.m0(t12, "input");
            int m08 = r9.y.m0(t12, "output");
            int m09 = r9.y.m0(t12, "initial_delay");
            int m010 = r9.y.m0(t12, "interval_duration");
            int m011 = r9.y.m0(t12, "flex_duration");
            int m012 = r9.y.m0(t12, "run_attempt_count");
            int m013 = r9.y.m0(t12, "backoff_policy");
            int m014 = r9.y.m0(t12, "backoff_delay_duration");
            int m015 = r9.y.m0(t12, "last_enqueue_time");
            c6270b = a5;
            try {
                m02 = r9.y.m0(t12, "minimum_retention_duration");
                s11 = s10;
            } catch (Throwable th3) {
                th2 = th3;
                s11 = s10;
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
                int i15 = m02;
                ArrayList arrayList = new ArrayList(t12.getCount());
                while (t12.moveToNext()) {
                    if (t12.isNull(m03)) {
                        str = null;
                    } else {
                        str = t12.getString(m03);
                    }
                    int e12 = A7.b.e1(t12.getInt(m04));
                    if (t12.isNull(m05)) {
                        str2 = null;
                    } else {
                        str2 = t12.getString(m05);
                    }
                    if (t12.isNull(m06)) {
                        str3 = null;
                    } else {
                        str3 = t12.getString(m06);
                    }
                    if (t12.isNull(m07)) {
                        bArr = null;
                    } else {
                        bArr = t12.getBlob(m07);
                    }
                    L3.g a10 = L3.g.a(bArr);
                    if (t12.isNull(m08)) {
                        bArr2 = null;
                    } else {
                        bArr2 = t12.getBlob(m08);
                    }
                    L3.g a11 = L3.g.a(bArr2);
                    long j6 = t12.getLong(m09);
                    long j10 = t12.getLong(m010);
                    long j11 = t12.getLong(m011);
                    int i16 = t12.getInt(m012);
                    int b1 = A7.b.b1(t12.getInt(m013));
                    long j12 = t12.getLong(m014);
                    long j13 = t12.getLong(m015);
                    int i17 = i15;
                    long j14 = t12.getLong(i17);
                    int i18 = m012;
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
                    int d12 = A7.b.d1(t12.getInt(i10));
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
                    int c12 = A7.b.c1(t12.getInt(i30));
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
                    arrayList.add(new q(str, e12, str2, str3, a10, a11, j6, j10, j11, new C0892d(c12, z11, z12, z13, z14, j17, j18, A7.b.e0(bArr3)), i16, b1, j12, j13, j14, j15, z10, d12, i22, i24, j16, i27, i29));
                    m012 = i18;
                    i15 = i17;
                }
                t12.close();
                if (s11 != null) {
                    s11.b();
                }
                c6270b.j();
                return arrayList;
            } catch (Throwable th4) {
                th2 = th4;
                t12.close();
                if (s11 != null) {
                    s11.b();
                }
                c6270b.j();
                throw th2;
            }
        } catch (Throwable th5) {
            th2 = th5;
            s11 = s10;
            c6270b = a5;
        }
    }

    public final ArrayList e(int i10) {
        S s10;
        S s11;
        C6270B c6270b;
        Throwable th2;
        int m02;
        String str;
        String str2;
        String str3;
        byte[] bArr;
        byte[] bArr2;
        boolean z10;
        int i11;
        boolean z11;
        int i12;
        boolean z12;
        int i13;
        boolean z13;
        int i14;
        boolean z14;
        int i15;
        byte[] bArr3;
        S d10 = L0.d();
        if (d10 != null) {
            s10 = d10.v("db.sql.room", "androidx.work.impl.model.WorkSpecDao");
        } else {
            s10 = null;
        }
        C6270B a5 = C6270B.a(1, "SELECT * FROM workspec WHERE state=0 AND schedule_requested_at=-1 ORDER BY last_enqueue_time LIMIT (SELECT MAX(?-COUNT(*), 0) FROM workspec WHERE schedule_requested_at<>-1 AND LENGTH(content_uri_triggers)=0 AND state NOT IN (2, 3, 5))");
        a5.T(1, i10);
        y yVar = this.f17474a;
        yVar.b();
        Cursor t12 = A7.b.t1(yVar, a5, false);
        try {
            int m03 = r9.y.m0(t12, ParameterNames.ID);
            int m04 = r9.y.m0(t12, "state");
            int m05 = r9.y.m0(t12, "worker_class_name");
            int m06 = r9.y.m0(t12, "input_merger_class_name");
            int m07 = r9.y.m0(t12, "input");
            int m08 = r9.y.m0(t12, "output");
            int m09 = r9.y.m0(t12, "initial_delay");
            int m010 = r9.y.m0(t12, "interval_duration");
            int m011 = r9.y.m0(t12, "flex_duration");
            int m012 = r9.y.m0(t12, "run_attempt_count");
            int m013 = r9.y.m0(t12, "backoff_policy");
            int m014 = r9.y.m0(t12, "backoff_delay_duration");
            int m015 = r9.y.m0(t12, "last_enqueue_time");
            c6270b = a5;
            try {
                m02 = r9.y.m0(t12, "minimum_retention_duration");
                s11 = s10;
            } catch (Throwable th3) {
                th2 = th3;
                s11 = s10;
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
                int i16 = m02;
                ArrayList arrayList = new ArrayList(t12.getCount());
                while (t12.moveToNext()) {
                    if (t12.isNull(m03)) {
                        str = null;
                    } else {
                        str = t12.getString(m03);
                    }
                    int e12 = A7.b.e1(t12.getInt(m04));
                    if (t12.isNull(m05)) {
                        str2 = null;
                    } else {
                        str2 = t12.getString(m05);
                    }
                    if (t12.isNull(m06)) {
                        str3 = null;
                    } else {
                        str3 = t12.getString(m06);
                    }
                    if (t12.isNull(m07)) {
                        bArr = null;
                    } else {
                        bArr = t12.getBlob(m07);
                    }
                    L3.g a10 = L3.g.a(bArr);
                    if (t12.isNull(m08)) {
                        bArr2 = null;
                    } else {
                        bArr2 = t12.getBlob(m08);
                    }
                    L3.g a11 = L3.g.a(bArr2);
                    long j6 = t12.getLong(m09);
                    long j10 = t12.getLong(m010);
                    long j11 = t12.getLong(m011);
                    int i17 = t12.getInt(m012);
                    int b1 = A7.b.b1(t12.getInt(m013));
                    long j12 = t12.getLong(m014);
                    long j13 = t12.getLong(m015);
                    int i18 = i16;
                    long j14 = t12.getLong(i18);
                    int i19 = m012;
                    int i20 = m016;
                    long j15 = t12.getLong(i20);
                    m016 = i20;
                    int i21 = m017;
                    if (t12.getInt(i21) != 0) {
                        m017 = i21;
                        i11 = m018;
                        z10 = true;
                    } else {
                        m017 = i21;
                        i11 = m018;
                        z10 = false;
                    }
                    int d12 = A7.b.d1(t12.getInt(i11));
                    m018 = i11;
                    int i22 = m019;
                    int i23 = t12.getInt(i22);
                    m019 = i22;
                    int i24 = m020;
                    int i25 = t12.getInt(i24);
                    m020 = i24;
                    int i26 = m021;
                    long j16 = t12.getLong(i26);
                    m021 = i26;
                    int i27 = m022;
                    int i28 = t12.getInt(i27);
                    m022 = i27;
                    int i29 = m023;
                    int i30 = t12.getInt(i29);
                    m023 = i29;
                    int i31 = m024;
                    int c12 = A7.b.c1(t12.getInt(i31));
                    m024 = i31;
                    int i32 = m025;
                    if (t12.getInt(i32) != 0) {
                        m025 = i32;
                        i12 = m026;
                        z11 = true;
                    } else {
                        m025 = i32;
                        i12 = m026;
                        z11 = false;
                    }
                    if (t12.getInt(i12) != 0) {
                        m026 = i12;
                        i13 = m027;
                        z12 = true;
                    } else {
                        m026 = i12;
                        i13 = m027;
                        z12 = false;
                    }
                    if (t12.getInt(i13) != 0) {
                        m027 = i13;
                        i14 = m028;
                        z13 = true;
                    } else {
                        m027 = i13;
                        i14 = m028;
                        z13 = false;
                    }
                    if (t12.getInt(i14) != 0) {
                        m028 = i14;
                        i15 = m029;
                        z14 = true;
                    } else {
                        m028 = i14;
                        i15 = m029;
                        z14 = false;
                    }
                    long j17 = t12.getLong(i15);
                    m029 = i15;
                    int i33 = m030;
                    long j18 = t12.getLong(i33);
                    m030 = i33;
                    int i34 = m031;
                    if (t12.isNull(i34)) {
                        bArr3 = null;
                    } else {
                        bArr3 = t12.getBlob(i34);
                    }
                    m031 = i34;
                    arrayList.add(new q(str, e12, str2, str3, a10, a11, j6, j10, j11, new C0892d(c12, z11, z12, z13, z14, j17, j18, A7.b.e0(bArr3)), i17, b1, j12, j13, j14, j15, z10, d12, i23, i25, j16, i28, i30));
                    m012 = i19;
                    i16 = i18;
                }
                t12.close();
                if (s11 != null) {
                    s11.b();
                }
                c6270b.j();
                return arrayList;
            } catch (Throwable th4) {
                th2 = th4;
                t12.close();
                if (s11 != null) {
                    s11.b();
                }
                c6270b.j();
                throw th2;
            }
        } catch (Throwable th5) {
            th2 = th5;
            s11 = s10;
            c6270b = a5;
        }
    }

    public final ArrayList f() {
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
        S d10 = L0.d();
        if (d10 != null) {
            s10 = d10.v("db.sql.room", "androidx.work.impl.model.WorkSpecDao");
        } else {
            s10 = null;
        }
        C6270B a5 = C6270B.a(0, "SELECT * FROM workspec WHERE state=0 AND schedule_requested_at=-1 AND LENGTH(content_uri_triggers)<>0 ORDER BY last_enqueue_time");
        y yVar = this.f17474a;
        yVar.b();
        Cursor t12 = A7.b.t1(yVar, a5, false);
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
                int e12 = A7.b.e1(t12.getInt(m03));
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
                L3.g a10 = L3.g.a(bArr);
                if (t12.isNull(m07)) {
                    bArr2 = null;
                } else {
                    bArr2 = t12.getBlob(m07);
                }
                L3.g a11 = L3.g.a(bArr2);
                long j6 = t12.getLong(m08);
                long j10 = t12.getLong(m09);
                long j11 = t12.getLong(m010);
                int i16 = t12.getInt(m011);
                int b1 = A7.b.b1(t12.getInt(m012));
                long j12 = t12.getLong(m013);
                long j13 = t12.getLong(m014);
                int i17 = i15;
                long j14 = t12.getLong(i17);
                int i18 = m012;
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
                int d12 = A7.b.d1(t12.getInt(i10));
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
                int c12 = A7.b.c1(t12.getInt(i30));
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
                arrayList.add(new q(str, e12, str2, str3, a10, a11, j6, j10, j11, new C0892d(c12, z11, z12, z13, z14, j17, j18, A7.b.e0(bArr3)), i16, b1, j12, j13, j14, j15, z10, d12, i22, i24, j16, i27, i29));
                m012 = i18;
                i15 = i17;
            }
            t12.close();
            if (s11 != null) {
                s11.b();
            }
            c6270b.j();
            return arrayList;
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

    public final ArrayList g() {
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
        S d10 = L0.d();
        if (d10 != null) {
            s10 = d10.v("db.sql.room", "androidx.work.impl.model.WorkSpecDao");
        } else {
            s10 = null;
        }
        C6270B a5 = C6270B.a(0, "SELECT * FROM workspec WHERE state=1");
        y yVar = this.f17474a;
        yVar.b();
        Cursor t12 = A7.b.t1(yVar, a5, false);
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
                int e12 = A7.b.e1(t12.getInt(m03));
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
                L3.g a10 = L3.g.a(bArr);
                if (t12.isNull(m07)) {
                    bArr2 = null;
                } else {
                    bArr2 = t12.getBlob(m07);
                }
                L3.g a11 = L3.g.a(bArr2);
                long j6 = t12.getLong(m08);
                long j10 = t12.getLong(m09);
                long j11 = t12.getLong(m010);
                int i16 = t12.getInt(m011);
                int b1 = A7.b.b1(t12.getInt(m012));
                long j12 = t12.getLong(m013);
                long j13 = t12.getLong(m014);
                int i17 = i15;
                long j14 = t12.getLong(i17);
                int i18 = m012;
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
                int d12 = A7.b.d1(t12.getInt(i10));
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
                int c12 = A7.b.c1(t12.getInt(i30));
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
                arrayList.add(new q(str, e12, str2, str3, a10, a11, j6, j10, j11, new C0892d(c12, z11, z12, z13, z14, j17, j18, A7.b.e0(bArr3)), i16, b1, j12, j13, j14, j15, z10, d12, i22, i24, j16, i27, i29));
                m012 = i18;
                i15 = i17;
            }
            t12.close();
            if (s11 != null) {
                s11.b();
            }
            c6270b.j();
            return arrayList;
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

    public final ArrayList h() {
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
        S d10 = L0.d();
        if (d10 != null) {
            s10 = d10.v("db.sql.room", "androidx.work.impl.model.WorkSpecDao");
        } else {
            s10 = null;
        }
        C6270B a5 = C6270B.a(0, "SELECT * FROM workspec WHERE state=0 AND schedule_requested_at<>-1");
        y yVar = this.f17474a;
        yVar.b();
        Cursor t12 = A7.b.t1(yVar, a5, false);
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
                int e12 = A7.b.e1(t12.getInt(m03));
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
                L3.g a10 = L3.g.a(bArr);
                if (t12.isNull(m07)) {
                    bArr2 = null;
                } else {
                    bArr2 = t12.getBlob(m07);
                }
                L3.g a11 = L3.g.a(bArr2);
                long j6 = t12.getLong(m08);
                long j10 = t12.getLong(m09);
                long j11 = t12.getLong(m010);
                int i16 = t12.getInt(m011);
                int b1 = A7.b.b1(t12.getInt(m012));
                long j12 = t12.getLong(m013);
                long j13 = t12.getLong(m014);
                int i17 = i15;
                long j14 = t12.getLong(i17);
                int i18 = m012;
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
                int d12 = A7.b.d1(t12.getInt(i10));
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
                int c12 = A7.b.c1(t12.getInt(i30));
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
                arrayList.add(new q(str, e12, str2, str3, a10, a11, j6, j10, j11, new C0892d(c12, z11, z12, z13, z14, j17, j18, A7.b.e0(bArr3)), i16, b1, j12, j13, j14, j15, z10, d12, i22, i24, j16, i27, i29));
                m012 = i18;
                i15 = i17;
            }
            t12.close();
            if (s11 != null) {
                s11.b();
            }
            c6270b.j();
            return arrayList;
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

    public final int i(String str) {
        S s10;
        S d10 = L0.d();
        Integer num = null;
        if (d10 != null) {
            s10 = d10.v("db.sql.room", "androidx.work.impl.model.WorkSpecDao");
        } else {
            s10 = null;
        }
        C6270B a5 = C6270B.a(1, "SELECT state FROM workspec WHERE id=?");
        if (str == null) {
            a5.s0(1);
        } else {
            a5.b(1, str);
        }
        y yVar = this.f17474a;
        yVar.b();
        int i10 = 0;
        Cursor t12 = A7.b.t1(yVar, a5, false);
        try {
            if (t12.moveToFirst()) {
                if (!t12.isNull(0)) {
                    num = Integer.valueOf(t12.getInt(0));
                }
                if (num != null) {
                    i10 = A7.b.e1(num.intValue());
                }
            }
            return i10;
        } finally {
            t12.close();
            if (s10 != null) {
                s10.b();
            }
            a5.j();
        }
    }

    public final ArrayList j(String str) {
        S s10;
        String str2;
        S d10 = L0.d();
        if (d10 != null) {
            s10 = d10.v("db.sql.room", "androidx.work.impl.model.WorkSpecDao");
        } else {
            s10 = null;
        }
        C6270B a5 = C6270B.a(1, "SELECT id FROM workspec WHERE state NOT IN (2, 3, 5) AND id IN (SELECT work_spec_id FROM workname WHERE name=?)");
        if (str == null) {
            a5.s0(1);
        } else {
            a5.b(1, str);
        }
        y yVar = this.f17474a;
        yVar.b();
        Cursor t12 = A7.b.t1(yVar, a5, false);
        try {
            ArrayList arrayList = new ArrayList(t12.getCount());
            while (t12.moveToNext()) {
                if (t12.isNull(0)) {
                    str2 = null;
                } else {
                    str2 = t12.getString(0);
                }
                arrayList.add(str2);
            }
            return arrayList;
        } finally {
            t12.close();
            if (s10 != null) {
                s10.b();
            }
            a5.j();
        }
    }

    public final ArrayList k(String str) {
        S s10;
        String str2;
        S d10 = L0.d();
        if (d10 != null) {
            s10 = d10.v("db.sql.room", "androidx.work.impl.model.WorkSpecDao");
        } else {
            s10 = null;
        }
        C6270B a5 = C6270B.a(1, "SELECT id FROM workspec WHERE state NOT IN (2, 3, 5) AND id IN (SELECT work_spec_id FROM worktag WHERE tag=?)");
        if (str == null) {
            a5.s0(1);
        } else {
            a5.b(1, str);
        }
        y yVar = this.f17474a;
        yVar.b();
        Cursor t12 = A7.b.t1(yVar, a5, false);
        try {
            ArrayList arrayList = new ArrayList(t12.getCount());
            while (t12.moveToNext()) {
                if (t12.isNull(0)) {
                    str2 = null;
                } else {
                    str2 = t12.getString(0);
                }
                arrayList.add(str2);
            }
            return arrayList;
        } finally {
            t12.close();
            if (s10 != null) {
                s10.b();
            }
            a5.j();
        }
    }

    public final q l(String str) {
        S s10;
        S s11;
        C6270B c6270b;
        Throwable th2;
        int m02;
        q qVar;
        String str2;
        String str3;
        String str4;
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
        S d10 = L0.d();
        if (d10 != null) {
            s10 = d10.v("db.sql.room", "androidx.work.impl.model.WorkSpecDao");
        } else {
            s10 = null;
        }
        C6270B a5 = C6270B.a(1, "SELECT * FROM workspec WHERE id=?");
        if (str == null) {
            a5.s0(1);
        } else {
            a5.b(1, str);
        }
        y yVar = this.f17474a;
        yVar.b();
        Cursor t12 = A7.b.t1(yVar, a5, false);
        try {
            int m03 = r9.y.m0(t12, ParameterNames.ID);
            int m04 = r9.y.m0(t12, "state");
            int m05 = r9.y.m0(t12, "worker_class_name");
            int m06 = r9.y.m0(t12, "input_merger_class_name");
            int m07 = r9.y.m0(t12, "input");
            int m08 = r9.y.m0(t12, "output");
            int m09 = r9.y.m0(t12, "initial_delay");
            int m010 = r9.y.m0(t12, "interval_duration");
            int m011 = r9.y.m0(t12, "flex_duration");
            int m012 = r9.y.m0(t12, "run_attempt_count");
            int m013 = r9.y.m0(t12, "backoff_policy");
            int m014 = r9.y.m0(t12, "backoff_delay_duration");
            int m015 = r9.y.m0(t12, "last_enqueue_time");
            c6270b = a5;
            try {
                m02 = r9.y.m0(t12, "minimum_retention_duration");
                s11 = s10;
            } catch (Throwable th3) {
                th2 = th3;
                s11 = s10;
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
                if (t12.moveToFirst()) {
                    if (t12.isNull(m03)) {
                        str2 = null;
                    } else {
                        str2 = t12.getString(m03);
                    }
                    int e12 = A7.b.e1(t12.getInt(m04));
                    if (t12.isNull(m05)) {
                        str3 = null;
                    } else {
                        str3 = t12.getString(m05);
                    }
                    if (t12.isNull(m06)) {
                        str4 = null;
                    } else {
                        str4 = t12.getString(m06);
                    }
                    if (t12.isNull(m07)) {
                        bArr = null;
                    } else {
                        bArr = t12.getBlob(m07);
                    }
                    L3.g a10 = L3.g.a(bArr);
                    if (t12.isNull(m08)) {
                        bArr2 = null;
                    } else {
                        bArr2 = t12.getBlob(m08);
                    }
                    L3.g a11 = L3.g.a(bArr2);
                    long j6 = t12.getLong(m09);
                    long j10 = t12.getLong(m010);
                    long j11 = t12.getLong(m011);
                    int i15 = t12.getInt(m012);
                    int b1 = A7.b.b1(t12.getInt(m013));
                    long j12 = t12.getLong(m014);
                    long j13 = t12.getLong(m015);
                    long j14 = t12.getLong(m02);
                    long j15 = t12.getLong(m016);
                    if (t12.getInt(m017) != 0) {
                        i10 = m018;
                        z10 = true;
                    } else {
                        i10 = m018;
                        z10 = false;
                    }
                    int d12 = A7.b.d1(t12.getInt(i10));
                    int i16 = t12.getInt(m019);
                    int i17 = t12.getInt(m020);
                    long j16 = t12.getLong(m021);
                    int i18 = t12.getInt(m022);
                    int i19 = t12.getInt(m023);
                    int c12 = A7.b.c1(t12.getInt(m024));
                    if (t12.getInt(m025) != 0) {
                        i11 = m026;
                        z11 = true;
                    } else {
                        i11 = m026;
                        z11 = false;
                    }
                    if (t12.getInt(i11) != 0) {
                        i12 = m027;
                        z12 = true;
                    } else {
                        i12 = m027;
                        z12 = false;
                    }
                    if (t12.getInt(i12) != 0) {
                        i13 = m028;
                        z13 = true;
                    } else {
                        i13 = m028;
                        z13 = false;
                    }
                    if (t12.getInt(i13) != 0) {
                        i14 = m029;
                        z14 = true;
                    } else {
                        i14 = m029;
                        z14 = false;
                    }
                    long j17 = t12.getLong(i14);
                    long j18 = t12.getLong(m030);
                    if (t12.isNull(m031)) {
                        bArr3 = null;
                    } else {
                        bArr3 = t12.getBlob(m031);
                    }
                    qVar = new q(str2, e12, str3, str4, a10, a11, j6, j10, j11, new C0892d(c12, z11, z12, z13, z14, j17, j18, A7.b.e0(bArr3)), i15, b1, j12, j13, j14, j15, z10, d12, i16, i17, j16, i18, i19);
                } else {
                    qVar = null;
                }
                t12.close();
                if (s11 != null) {
                    s11.b();
                }
                c6270b.j();
                return qVar;
            } catch (Throwable th4) {
                th2 = th4;
                t12.close();
                if (s11 != null) {
                    s11.b();
                }
                c6270b.j();
                throw th2;
            }
        } catch (Throwable th5) {
            th2 = th5;
            s11 = s10;
            c6270b = a5;
        }
    }

    /* JADX WARN: Type inference failed for: r8v0, types: [U3.o, java.lang.Object] */
    public final ArrayList m(String str) {
        S s10;
        String str2;
        S d10 = L0.d();
        if (d10 != null) {
            s10 = d10.v("db.sql.room", "androidx.work.impl.model.WorkSpecDao");
        } else {
            s10 = null;
        }
        C6270B a5 = C6270B.a(1, "SELECT id, state FROM workspec WHERE id IN (SELECT work_spec_id FROM workname WHERE name=?)");
        if (str == null) {
            a5.s0(1);
        } else {
            a5.b(1, str);
        }
        y yVar = this.f17474a;
        yVar.b();
        Cursor t12 = A7.b.t1(yVar, a5, false);
        try {
            ArrayList arrayList = new ArrayList(t12.getCount());
            while (t12.moveToNext()) {
                if (t12.isNull(0)) {
                    str2 = null;
                } else {
                    str2 = t12.getString(0);
                }
                int e12 = A7.b.e1(t12.getInt(1));
                AbstractC3557B.c0(ParameterNames.ID, str2);
                ?? obj = new Object();
                obj.f17430a = str2;
                obj.f17431b = e12;
                arrayList.add(obj);
            }
            return arrayList;
        } finally {
            t12.close();
            if (s10 != null) {
                s10.b();
            }
            a5.j();
        }
    }

    public final boolean n() {
        S s10;
        S d10 = L0.d();
        if (d10 != null) {
            s10 = d10.v("db.sql.room", "androidx.work.impl.model.WorkSpecDao");
        } else {
            s10 = null;
        }
        boolean z10 = false;
        C6270B a5 = C6270B.a(0, "SELECT COUNT(*) > 0 FROM workspec WHERE state NOT IN (2, 3, 5) LIMIT 1");
        y yVar = this.f17474a;
        yVar.b();
        Cursor t12 = A7.b.t1(yVar, a5, false);
        try {
            if (t12.moveToFirst()) {
                if (t12.getInt(0) != 0) {
                    z10 = true;
                }
            }
            return z10;
        } finally {
            t12.close();
            if (s10 != null) {
                s10.b();
            }
            a5.j();
        }
    }

    public final void o(String str) {
        S s10;
        S d10 = L0.d();
        if (d10 != null) {
            s10 = d10.v("db.sql.room", "androidx.work.impl.model.WorkSpecDao");
        } else {
            s10 = null;
        }
        y yVar = this.f17474a;
        yVar.b();
        r rVar = this.f17479f;
        B3.i c10 = rVar.c();
        if (str == null) {
            c10.s0(1);
        } else {
            c10.b(1, str);
        }
        yVar.c();
        try {
            c10.w();
            yVar.n();
            if (s10 != null) {
                s10.c(C1.OK);
            }
        } finally {
            yVar.j();
            if (s10 != null) {
                s10.b();
            }
            rVar.g(c10);
        }
    }

    public final void p(String str) {
        S s10;
        S d10 = L0.d();
        if (d10 != null) {
            s10 = d10.v("db.sql.room", "androidx.work.impl.model.WorkSpecDao");
        } else {
            s10 = null;
        }
        y yVar = this.f17474a;
        yVar.b();
        r rVar = this.f17482i;
        B3.i c10 = rVar.c();
        if (str == null) {
            c10.s0(1);
        } else {
            c10.b(1, str);
        }
        yVar.c();
        try {
            c10.w();
            yVar.n();
            if (s10 != null) {
                s10.c(C1.OK);
            }
        } finally {
            yVar.j();
            if (s10 != null) {
                s10.b();
            }
            rVar.g(c10);
        }
    }

    public final void q(long j6, String str) {
        S s10;
        S d10 = L0.d();
        if (d10 != null) {
            s10 = d10.v("db.sql.room", "androidx.work.impl.model.WorkSpecDao");
        } else {
            s10 = null;
        }
        y yVar = this.f17474a;
        yVar.b();
        r rVar = this.f17485l;
        B3.i c10 = rVar.c();
        c10.T(1, j6);
        if (str == null) {
            c10.s0(2);
        } else {
            c10.b(2, str);
        }
        yVar.c();
        try {
            c10.w();
            yVar.n();
            if (s10 != null) {
                s10.c(C1.OK);
            }
        } finally {
            yVar.j();
            if (s10 != null) {
                s10.b();
            }
            rVar.g(c10);
        }
    }

    public final void r(int i10, String str) {
        S s10;
        S d10 = L0.d();
        if (d10 != null) {
            s10 = d10.v("db.sql.room", "androidx.work.impl.model.WorkSpecDao");
        } else {
            s10 = null;
        }
        y yVar = this.f17474a;
        yVar.b();
        r rVar = this.f17484k;
        B3.i c10 = rVar.c();
        if (str == null) {
            c10.s0(1);
        } else {
            c10.b(1, str);
        }
        c10.T(2, i10);
        yVar.c();
        try {
            c10.w();
            yVar.n();
            if (s10 != null) {
                s10.c(C1.OK);
            }
        } finally {
            yVar.j();
            if (s10 != null) {
                s10.b();
            }
            rVar.g(c10);
        }
    }

    public final void s(String str) {
        S s10;
        S d10 = L0.d();
        if (d10 != null) {
            s10 = d10.v("db.sql.room", "androidx.work.impl.model.WorkSpecDao");
        } else {
            s10 = null;
        }
        y yVar = this.f17474a;
        yVar.b();
        r rVar = this.f17483j;
        B3.i c10 = rVar.c();
        if (str == null) {
            c10.s0(1);
        } else {
            c10.b(1, str);
        }
        yVar.c();
        try {
            c10.w();
            yVar.n();
            if (s10 != null) {
                s10.c(C1.OK);
            }
        } finally {
            yVar.j();
            if (s10 != null) {
                s10.b();
            }
            rVar.g(c10);
        }
    }

    public final void t(long j6, String str) {
        S s10;
        S d10 = L0.d();
        if (d10 != null) {
            s10 = d10.v("db.sql.room", "androidx.work.impl.model.WorkSpecDao");
        } else {
            s10 = null;
        }
        y yVar = this.f17474a;
        yVar.b();
        r rVar = this.f17481h;
        B3.i c10 = rVar.c();
        c10.T(1, j6);
        if (str == null) {
            c10.s0(2);
        } else {
            c10.b(2, str);
        }
        yVar.c();
        try {
            c10.w();
            yVar.n();
            if (s10 != null) {
                s10.c(C1.OK);
            }
        } finally {
            yVar.j();
            if (s10 != null) {
                s10.b();
            }
            rVar.g(c10);
        }
    }

    public final void u(String str, L3.g gVar) {
        S s10;
        S d10 = L0.d();
        if (d10 != null) {
            s10 = d10.v("db.sql.room", "androidx.work.impl.model.WorkSpecDao");
        } else {
            s10 = null;
        }
        y yVar = this.f17474a;
        yVar.b();
        r rVar = this.f17480g;
        B3.i c10 = rVar.c();
        byte[] b10 = L3.g.b(gVar);
        if (b10 == null) {
            c10.s0(1);
        } else {
            c10.b0(1, b10);
        }
        if (str == null) {
            c10.s0(2);
        } else {
            c10.b(2, str);
        }
        yVar.c();
        try {
            c10.w();
            yVar.n();
            if (s10 != null) {
                s10.c(C1.OK);
            }
        } finally {
            yVar.j();
            if (s10 != null) {
                s10.b();
            }
            rVar.g(c10);
        }
    }

    public final void v(int i10, String str) {
        S s10;
        S d10 = L0.d();
        if (d10 != null) {
            s10 = d10.v("db.sql.room", "androidx.work.impl.model.WorkSpecDao");
        } else {
            s10 = null;
        }
        y yVar = this.f17474a;
        yVar.b();
        r rVar = this.f17477d;
        B3.i c10 = rVar.c();
        c10.T(1, A7.b.H1(i10));
        if (str == null) {
            c10.s0(2);
        } else {
            c10.b(2, str);
        }
        yVar.c();
        try {
            c10.w();
            yVar.n();
            if (s10 != null) {
                s10.c(C1.OK);
            }
        } finally {
            yVar.j();
            if (s10 != null) {
                s10.b();
            }
            rVar.g(c10);
        }
    }

    public final void w(int i10, String str) {
        S s10;
        S d10 = L0.d();
        if (d10 != null) {
            s10 = d10.v("db.sql.room", "androidx.work.impl.model.WorkSpecDao");
        } else {
            s10 = null;
        }
        y yVar = this.f17474a;
        yVar.b();
        r rVar = this.f17487n;
        B3.i c10 = rVar.c();
        c10.T(1, i10);
        if (str == null) {
            c10.s0(2);
        } else {
            c10.b(2, str);
        }
        yVar.c();
        try {
            c10.w();
            yVar.n();
            if (s10 != null) {
                s10.c(C1.OK);
            }
        } finally {
            yVar.j();
            if (s10 != null) {
                s10.b();
            }
            rVar.g(c10);
        }
    }
}
