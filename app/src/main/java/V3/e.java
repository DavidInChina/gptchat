package V3;

import L3.C0892d;
import L3.D;
import L3.z;
import M3.F;
import M3.x;
import android.database.Cursor;
import android.gov.nist.core.Separators;
import android.gov.nist.javax.sip.header.ParameterNames;
import android.os.Build;
import android.text.TextUtils;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.background.systemalarm.RescheduleReceiver;
import androidx.work.impl.workers.ConstraintTrackingWorker;
import c1.AbstractC2279d;
import com.google.android.gms.internal.play_billing.AbstractC2469q0;
import id.AbstractC3557B;
import io.sentry.C1;
import io.sentry.L0;
import io.sentry.S;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.UUID;
import x3.C6270B;
import x3.y;

/* loaded from: classes.dex */
public final class e implements Runnable {

    /* renamed from: h0  reason: collision with root package name */
    public static final String f18340h0 = L3.s.f("EnqueueRunnable");

    /* renamed from: Y  reason: collision with root package name */
    public final x f18341Y;

    /* renamed from: Z  reason: collision with root package name */
    public final U3.e f18342Z;

    public e(x xVar) {
        U3.e eVar = new U3.e(7);
        this.f18341Y = xVar;
        this.f18342Z = eVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0227 A[Catch: all -> 0x0540, TryCatch #12 {all -> 0x0540, blocks: (B:67:0x013c, B:69:0x0142, B:71:0x014d, B:73:0x0158, B:74:0x015c, B:75:0x015f, B:82:0x0182, B:84:0x0187, B:85:0x018a, B:87:0x018f, B:91:0x0197, B:97:0x01a4, B:107:0x01dc, B:108:0x01e8, B:110:0x01ee, B:111:0x01fa, B:112:0x0202, B:118:0x021b, B:119:0x0221, B:121:0x0227, B:125:0x0235, B:128:0x023d, B:129:0x0241, B:130:0x0246, B:131:0x0249, B:134:0x024f, B:136:0x0260, B:138:0x0274, B:140:0x0278, B:144:0x0281, B:147:0x0353, B:149:0x035c, B:152:0x036d, B:156:0x0388, B:158:0x038d, B:159:0x0390, B:161:0x0398, B:163:0x039e, B:165:0x03b9, B:167:0x03c4, B:171:0x03ea, B:173:0x03f3, B:174:0x03f6, B:177:0x040f, B:178:0x042a, B:180:0x0430, B:182:0x0441, B:184:0x044a, B:188:0x0470, B:190:0x0479, B:192:0x048c, B:194:0x04a7, B:196:0x04b0, B:200:0x04d6, B:202:0x04df, B:206:0x0514, B:197:0x04be, B:199:0x04ce, B:153:0x0375, B:155:0x037f, B:168:0x03d2, B:170:0x03e2, B:185:0x0458, B:187:0x0468, B:76:0x016f, B:78:0x0175), top: B:233:0x013c }] */
    /* JADX WARN: Removed duplicated region for block: B:149:0x035c A[Catch: all -> 0x0540, TryCatch #12 {all -> 0x0540, blocks: (B:67:0x013c, B:69:0x0142, B:71:0x014d, B:73:0x0158, B:74:0x015c, B:75:0x015f, B:82:0x0182, B:84:0x0187, B:85:0x018a, B:87:0x018f, B:91:0x0197, B:97:0x01a4, B:107:0x01dc, B:108:0x01e8, B:110:0x01ee, B:111:0x01fa, B:112:0x0202, B:118:0x021b, B:119:0x0221, B:121:0x0227, B:125:0x0235, B:128:0x023d, B:129:0x0241, B:130:0x0246, B:131:0x0249, B:134:0x024f, B:136:0x0260, B:138:0x0274, B:140:0x0278, B:144:0x0281, B:147:0x0353, B:149:0x035c, B:152:0x036d, B:156:0x0388, B:158:0x038d, B:159:0x0390, B:161:0x0398, B:163:0x039e, B:165:0x03b9, B:167:0x03c4, B:171:0x03ea, B:173:0x03f3, B:174:0x03f6, B:177:0x040f, B:178:0x042a, B:180:0x0430, B:182:0x0441, B:184:0x044a, B:188:0x0470, B:190:0x0479, B:192:0x048c, B:194:0x04a7, B:196:0x04b0, B:200:0x04d6, B:202:0x04df, B:206:0x0514, B:197:0x04be, B:199:0x04ce, B:153:0x0375, B:155:0x037f, B:168:0x03d2, B:170:0x03e2, B:185:0x0458, B:187:0x0468, B:76:0x016f, B:78:0x0175), top: B:233:0x013c }] */
    /* JADX WARN: Removed duplicated region for block: B:151:0x0368  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x037f A[Catch: all -> 0x0385, TRY_LEAVE, TryCatch #12 {all -> 0x0540, blocks: (B:67:0x013c, B:69:0x0142, B:71:0x014d, B:73:0x0158, B:74:0x015c, B:75:0x015f, B:82:0x0182, B:84:0x0187, B:85:0x018a, B:87:0x018f, B:91:0x0197, B:97:0x01a4, B:107:0x01dc, B:108:0x01e8, B:110:0x01ee, B:111:0x01fa, B:112:0x0202, B:118:0x021b, B:119:0x0221, B:121:0x0227, B:125:0x0235, B:128:0x023d, B:129:0x0241, B:130:0x0246, B:131:0x0249, B:134:0x024f, B:136:0x0260, B:138:0x0274, B:140:0x0278, B:144:0x0281, B:147:0x0353, B:149:0x035c, B:152:0x036d, B:156:0x0388, B:158:0x038d, B:159:0x0390, B:161:0x0398, B:163:0x039e, B:165:0x03b9, B:167:0x03c4, B:171:0x03ea, B:173:0x03f3, B:174:0x03f6, B:177:0x040f, B:178:0x042a, B:180:0x0430, B:182:0x0441, B:184:0x044a, B:188:0x0470, B:190:0x0479, B:192:0x048c, B:194:0x04a7, B:196:0x04b0, B:200:0x04d6, B:202:0x04df, B:206:0x0514, B:197:0x04be, B:199:0x04ce, B:153:0x0375, B:155:0x037f, B:168:0x03d2, B:170:0x03e2, B:185:0x0458, B:187:0x0468, B:76:0x016f, B:78:0x0175), top: B:233:0x013c }] */
    /* JADX WARN: Removed duplicated region for block: B:158:0x038d A[Catch: all -> 0x0540, TryCatch #12 {all -> 0x0540, blocks: (B:67:0x013c, B:69:0x0142, B:71:0x014d, B:73:0x0158, B:74:0x015c, B:75:0x015f, B:82:0x0182, B:84:0x0187, B:85:0x018a, B:87:0x018f, B:91:0x0197, B:97:0x01a4, B:107:0x01dc, B:108:0x01e8, B:110:0x01ee, B:111:0x01fa, B:112:0x0202, B:118:0x021b, B:119:0x0221, B:121:0x0227, B:125:0x0235, B:128:0x023d, B:129:0x0241, B:130:0x0246, B:131:0x0249, B:134:0x024f, B:136:0x0260, B:138:0x0274, B:140:0x0278, B:144:0x0281, B:147:0x0353, B:149:0x035c, B:152:0x036d, B:156:0x0388, B:158:0x038d, B:159:0x0390, B:161:0x0398, B:163:0x039e, B:165:0x03b9, B:167:0x03c4, B:171:0x03ea, B:173:0x03f3, B:174:0x03f6, B:177:0x040f, B:178:0x042a, B:180:0x0430, B:182:0x0441, B:184:0x044a, B:188:0x0470, B:190:0x0479, B:192:0x048c, B:194:0x04a7, B:196:0x04b0, B:200:0x04d6, B:202:0x04df, B:206:0x0514, B:197:0x04be, B:199:0x04ce, B:153:0x0375, B:155:0x037f, B:168:0x03d2, B:170:0x03e2, B:185:0x0458, B:187:0x0468, B:76:0x016f, B:78:0x0175), top: B:233:0x013c }] */
    /* JADX WARN: Removed duplicated region for block: B:161:0x0398 A[Catch: all -> 0x0540, TryCatch #12 {all -> 0x0540, blocks: (B:67:0x013c, B:69:0x0142, B:71:0x014d, B:73:0x0158, B:74:0x015c, B:75:0x015f, B:82:0x0182, B:84:0x0187, B:85:0x018a, B:87:0x018f, B:91:0x0197, B:97:0x01a4, B:107:0x01dc, B:108:0x01e8, B:110:0x01ee, B:111:0x01fa, B:112:0x0202, B:118:0x021b, B:119:0x0221, B:121:0x0227, B:125:0x0235, B:128:0x023d, B:129:0x0241, B:130:0x0246, B:131:0x0249, B:134:0x024f, B:136:0x0260, B:138:0x0274, B:140:0x0278, B:144:0x0281, B:147:0x0353, B:149:0x035c, B:152:0x036d, B:156:0x0388, B:158:0x038d, B:159:0x0390, B:161:0x0398, B:163:0x039e, B:165:0x03b9, B:167:0x03c4, B:171:0x03ea, B:173:0x03f3, B:174:0x03f6, B:177:0x040f, B:178:0x042a, B:180:0x0430, B:182:0x0441, B:184:0x044a, B:188:0x0470, B:190:0x0479, B:192:0x048c, B:194:0x04a7, B:196:0x04b0, B:200:0x04d6, B:202:0x04df, B:206:0x0514, B:197:0x04be, B:199:0x04ce, B:153:0x0375, B:155:0x037f, B:168:0x03d2, B:170:0x03e2, B:185:0x0458, B:187:0x0468, B:76:0x016f, B:78:0x0175), top: B:233:0x013c }] */
    /* JADX WARN: Removed duplicated region for block: B:176:0x040b  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x0430 A[Catch: all -> 0x0540, TryCatch #12 {all -> 0x0540, blocks: (B:67:0x013c, B:69:0x0142, B:71:0x014d, B:73:0x0158, B:74:0x015c, B:75:0x015f, B:82:0x0182, B:84:0x0187, B:85:0x018a, B:87:0x018f, B:91:0x0197, B:97:0x01a4, B:107:0x01dc, B:108:0x01e8, B:110:0x01ee, B:111:0x01fa, B:112:0x0202, B:118:0x021b, B:119:0x0221, B:121:0x0227, B:125:0x0235, B:128:0x023d, B:129:0x0241, B:130:0x0246, B:131:0x0249, B:134:0x024f, B:136:0x0260, B:138:0x0274, B:140:0x0278, B:144:0x0281, B:147:0x0353, B:149:0x035c, B:152:0x036d, B:156:0x0388, B:158:0x038d, B:159:0x0390, B:161:0x0398, B:163:0x039e, B:165:0x03b9, B:167:0x03c4, B:171:0x03ea, B:173:0x03f3, B:174:0x03f6, B:177:0x040f, B:178:0x042a, B:180:0x0430, B:182:0x0441, B:184:0x044a, B:188:0x0470, B:190:0x0479, B:192:0x048c, B:194:0x04a7, B:196:0x04b0, B:200:0x04d6, B:202:0x04df, B:206:0x0514, B:197:0x04be, B:199:0x04ce, B:153:0x0375, B:155:0x037f, B:168:0x03d2, B:170:0x03e2, B:185:0x0458, B:187:0x0468, B:76:0x016f, B:78:0x0175), top: B:233:0x013c }] */
    /* JADX WARN: Removed duplicated region for block: B:192:0x048c A[Catch: all -> 0x0540, TryCatch #12 {all -> 0x0540, blocks: (B:67:0x013c, B:69:0x0142, B:71:0x014d, B:73:0x0158, B:74:0x015c, B:75:0x015f, B:82:0x0182, B:84:0x0187, B:85:0x018a, B:87:0x018f, B:91:0x0197, B:97:0x01a4, B:107:0x01dc, B:108:0x01e8, B:110:0x01ee, B:111:0x01fa, B:112:0x0202, B:118:0x021b, B:119:0x0221, B:121:0x0227, B:125:0x0235, B:128:0x023d, B:129:0x0241, B:130:0x0246, B:131:0x0249, B:134:0x024f, B:136:0x0260, B:138:0x0274, B:140:0x0278, B:144:0x0281, B:147:0x0353, B:149:0x035c, B:152:0x036d, B:156:0x0388, B:158:0x038d, B:159:0x0390, B:161:0x0398, B:163:0x039e, B:165:0x03b9, B:167:0x03c4, B:171:0x03ea, B:173:0x03f3, B:174:0x03f6, B:177:0x040f, B:178:0x042a, B:180:0x0430, B:182:0x0441, B:184:0x044a, B:188:0x0470, B:190:0x0479, B:192:0x048c, B:194:0x04a7, B:196:0x04b0, B:200:0x04d6, B:202:0x04df, B:206:0x0514, B:197:0x04be, B:199:0x04ce, B:153:0x0375, B:155:0x037f, B:168:0x03d2, B:170:0x03e2, B:185:0x0458, B:187:0x0468, B:76:0x016f, B:78:0x0175), top: B:233:0x013c }] */
    /* JADX WARN: Removed duplicated region for block: B:203:0x04f0  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x051e A[Catch: all -> 0x0534, TryCatch #10 {all -> 0x0534, blocks: (B:207:0x0519, B:209:0x051e, B:213:0x0536), top: B:237:0x0519 }] */
    /* JADX WARN: Type inference failed for: r13v17, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r1v47 */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        U3.e eVar;
        Throwable th2;
        WorkDatabase workDatabase;
        Throwable th3;
        boolean z10;
        U3.e eVar2;
        F f6;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        boolean z15;
        String str;
        boolean z16;
        boolean z17;
        Iterator it;
        U3.s sVar;
        String str2;
        D d10;
        boolean z18;
        WorkDatabase workDatabase2;
        String str3;
        x xVar;
        F f10;
        String[] strArr;
        long j6;
        Iterator it2;
        boolean z19;
        S d11;
        String str4;
        S s10;
        String str5;
        String str6;
        S s11;
        S s12;
        String str7;
        S s13;
        boolean z20;
        boolean z21;
        S s14;
        boolean z22;
        boolean z23;
        boolean z24;
        e eVar3 = this;
        U3.e eVar4 = eVar3.f18342Z;
        x xVar2 = eVar3.f18341Y;
        try {
            xVar2.getClass();
            F f11 = xVar2.f11609f;
            try {
                if (!x.G0(xVar2, new HashSet())) {
                    WorkDatabase workDatabase3 = f11.f11519h;
                    workDatabase3.c();
                    try {
                        AbstractC2279d.j(workDatabase3, f11.f11518g, xVar2);
                        String[] strArr2 = (String[]) x.H0(xVar2).toArray(new String[0]);
                        f11.f11518g.f10686c.getClass();
                        long currentTimeMillis = System.currentTimeMillis();
                        if (strArr2 != null && strArr2.length > 0) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        WorkDatabase workDatabase4 = f11.f11519h;
                        if (z10) {
                            z14 = false;
                            z13 = false;
                            z15 = true;
                            for (String str8 : strArr2) {
                                U3.q l10 = workDatabase4.u().l(str8);
                                if (l10 == null) {
                                    L3.s.d().b(f18340h0, "Prerequisite " + str8 + " doesn't exist; not enqueuing");
                                    break;
                                }
                                int i10 = l10.f17451b;
                                if (i10 == 3) {
                                    z24 = true;
                                } else {
                                    z24 = false;
                                }
                                z15 &= z24;
                                if (i10 == 4) {
                                    z13 = true;
                                } else if (i10 == 6) {
                                    z14 = true;
                                }
                            }
                        } else {
                            z15 = true;
                            z14 = false;
                            z13 = false;
                        }
                        String str9 = xVar2.f11610g;
                        boolean z25 = !TextUtils.isEmpty(str9);
                        String str10 = "androidx.work.impl.model.DependencyDao";
                        String str11 = "db.sql.room";
                        try {
                            if (z25 && !z10) {
                                try {
                                    ArrayList m10 = workDatabase4.u().m(str9);
                                    if (!m10.isEmpty()) {
                                        int i11 = xVar2.f11611h;
                                        if (i11 != 3 && i11 != 4) {
                                            if (i11 == 2) {
                                                Iterator it3 = m10.iterator();
                                                while (it3.hasNext()) {
                                                    int i12 = ((U3.o) it3.next()).f17431b;
                                                    Iterator it4 = it3;
                                                    if (i12 != 1 && i12 != 2) {
                                                        it3 = it4;
                                                    }
                                                    eVar2 = eVar4;
                                                    workDatabase = workDatabase3;
                                                    f6 = f11;
                                                    z12 = true;
                                                    z11 = false;
                                                }
                                            }
                                            new c(f11, str9).run();
                                            U3.s u10 = workDatabase4.u();
                                            Iterator it5 = m10.iterator();
                                            while (it5.hasNext()) {
                                                u10.c(((U3.o) it5.next()).f17430a);
                                            }
                                            eVar2 = eVar4;
                                            workDatabase = workDatabase3;
                                            z16 = z25;
                                            str = str10;
                                            z17 = true;
                                            it = xVar2.f11612i.iterator();
                                            while (it.hasNext()) {
                                            }
                                            f6 = f11;
                                            z11 = z17;
                                            z12 = true;
                                            xVar2.f11615l = z12;
                                            workDatabase.n();
                                            workDatabase.j();
                                            if (z11) {
                                            }
                                            eVar2.y(z.f10734n);
                                            return;
                                        }
                                        U3.c p10 = workDatabase4.p();
                                        ArrayList arrayList = new ArrayList();
                                        Iterator it6 = m10.iterator();
                                        while (it6.hasNext()) {
                                            Iterator it7 = it6;
                                            U3.o oVar = (U3.o) it6.next();
                                            eVar2 = eVar4;
                                            try {
                                                String str12 = oVar.f17430a;
                                                p10.getClass();
                                                workDatabase = workDatabase3;
                                                try {
                                                    S d12 = L0.d();
                                                    if (d12 != null) {
                                                        s14 = d12.v(str11, str10);
                                                        z21 = z25;
                                                    } else {
                                                        z21 = z25;
                                                        s14 = null;
                                                    }
                                                    String str13 = str10;
                                                    C6270B a5 = C6270B.a(1, "SELECT COUNT(*)>0 FROM dependency WHERE prerequisite_id=?");
                                                    if (str12 == null) {
                                                        a5.s0(1);
                                                    } else {
                                                        a5.b(1, str12);
                                                    }
                                                    ((y) p10.f17396Z).b();
                                                    Cursor t12 = A7.b.t1((y) p10.f17396Z, a5, false);
                                                    if (t12.moveToFirst() && t12.getInt(0) != 0) {
                                                        z22 = true;
                                                    } else {
                                                        z22 = false;
                                                    }
                                                    t12.close();
                                                    if (s14 != null) {
                                                        s14.b();
                                                    }
                                                    a5.j();
                                                    if (!z22) {
                                                        int i13 = oVar.f17431b;
                                                        if (i13 == 3) {
                                                            z23 = true;
                                                        } else {
                                                            z23 = false;
                                                        }
                                                        boolean z26 = z15 & z23;
                                                        if (i13 == 4) {
                                                            z13 = true;
                                                        } else if (i13 == 6) {
                                                            z14 = true;
                                                        }
                                                        arrayList.add(oVar.f17430a);
                                                        z15 = z26;
                                                    }
                                                    eVar4 = eVar2;
                                                    it6 = it7;
                                                    workDatabase3 = workDatabase;
                                                    z25 = z21;
                                                    str10 = str13;
                                                } catch (Throwable th4) {
                                                    th3 = th4;
                                                    workDatabase.j();
                                                    throw th3;
                                                }
                                            } catch (Throwable th5) {
                                                th3 = th5;
                                                workDatabase = workDatabase3;
                                                workDatabase.j();
                                                throw th3;
                                            }
                                        }
                                        eVar2 = eVar4;
                                        workDatabase = workDatabase3;
                                        z16 = z25;
                                        str = str10;
                                        z20 = false;
                                        ArrayList arrayList2 = arrayList;
                                        arrayList2 = arrayList;
                                        if (i11 == 4 && (z14 || z13)) {
                                            U3.s u11 = workDatabase4.u();
                                            Iterator it8 = u11.m(str9).iterator();
                                            while (it8.hasNext()) {
                                                u11.c(((U3.o) it8.next()).f17430a);
                                            }
                                            z14 = false;
                                            z13 = false;
                                            arrayList2 = Collections.emptyList();
                                        }
                                        strArr2 = (String[]) arrayList2.toArray(strArr2);
                                        if (strArr2.length > 0) {
                                            z10 = true;
                                        } else {
                                            z10 = false;
                                        }
                                        z17 = z20;
                                        it = xVar2.f11612i.iterator();
                                        while (it.hasNext()) {
                                            D d13 = (D) it.next();
                                            U3.q qVar = d13.f10681b;
                                            if (z10 && !z15) {
                                                if (z13) {
                                                    qVar.f17451b = 4;
                                                } else if (z14) {
                                                    qVar.f17451b = 6;
                                                } else {
                                                    qVar.f17451b = 5;
                                                }
                                            } else {
                                                qVar.f17463n = currentTimeMillis;
                                            }
                                            if (qVar.f17451b == 1) {
                                                z17 = true;
                                            }
                                            U3.s u12 = workDatabase4.u();
                                            AbstractC3557B.c0("schedulers", f11.f11521j);
                                            if (Build.VERSION.SDK_INT < 26) {
                                                C0892d c0892d = qVar.f17459j;
                                                z19 = z17;
                                                String name = ConstraintTrackingWorker.class.getName();
                                                it2 = it;
                                                String str14 = qVar.f17452c;
                                                if (AbstractC3557B.K(str14, name) || (!c0892d.f10702d && !c0892d.f10703e)) {
                                                    xVar = xVar2;
                                                }
                                                androidx.lifecycle.D d14 = new androidx.lifecycle.D(2);
                                                d14.o(qVar.f17454e.f10715a);
                                                j6 = currentTimeMillis;
                                                d14.f25290b.put("androidx.work.impl.workers.ConstraintTrackingWorker.ARGUMENT_CLASS_NAME", str14);
                                                L3.g gVar = new L3.g(d14.f25290b);
                                                L3.g.b(gVar);
                                                String name2 = ConstraintTrackingWorker.class.getName();
                                                int i14 = qVar.f17451b;
                                                long j10 = qVar.f17456g;
                                                C0892d c0892d2 = qVar.f17459j;
                                                F f12 = f11;
                                                strArr = strArr2;
                                                long j11 = qVar.f17463n;
                                                f10 = f12;
                                                boolean z27 = qVar.f17466q;
                                                xVar = xVar2;
                                                str3 = str9;
                                                String str15 = qVar.f17450a;
                                                AbstractC3557B.c0(ParameterNames.ID, str15);
                                                AbstractC2469q0.q("state", i14);
                                                String str16 = qVar.f17453d;
                                                workDatabase2 = workDatabase4;
                                                AbstractC3557B.c0("inputMergerClassName", str16);
                                                L3.g gVar2 = qVar.f17455f;
                                                z18 = z10;
                                                AbstractC3557B.c0("output", gVar2);
                                                AbstractC3557B.c0("constraints", c0892d2);
                                                int i15 = qVar.f17461l;
                                                d10 = d13;
                                                AbstractC2469q0.q("backoffPolicy", i15);
                                                int i16 = qVar.f17467r;
                                                str2 = str11;
                                                AbstractC2469q0.q("outOfQuotaPolicy", i16);
                                                sVar = u12;
                                                qVar = new U3.q(str15, i14, name2, str16, gVar, gVar2, j10, qVar.f17457h, qVar.f17458i, c0892d2, qVar.f17460k, i15, qVar.f17462m, j11, qVar.f17464o, qVar.f17465p, z27, i16, qVar.f17468s, qVar.f17469t, qVar.f17470u, qVar.f17471v, qVar.f17472w);
                                                sVar.getClass();
                                                d11 = L0.d();
                                                if (d11 == null) {
                                                    str4 = str2;
                                                    s10 = d11.v(str4, "androidx.work.impl.model.WorkSpecDao");
                                                } else {
                                                    str4 = str2;
                                                    s10 = null;
                                                }
                                                U3.s sVar2 = sVar;
                                                y yVar = sVar2.f17474a;
                                                yVar.b();
                                                yVar.c();
                                                sVar2.f17475b.i(qVar);
                                                yVar.n();
                                                if (s10 != null) {
                                                    s10.c(C1.OK);
                                                }
                                                yVar.j();
                                                if (s10 != null) {
                                                    s10.b();
                                                }
                                                D d15 = d10;
                                                UUID uuid = d15.f10680a;
                                                if (!z18) {
                                                    strArr2 = strArr;
                                                    int length = strArr2.length;
                                                    int i17 = 0;
                                                    while (i17 < length) {
                                                        String str17 = strArr2[i17];
                                                        String uuid2 = uuid.toString();
                                                        AbstractC3557B.b0("id.toString()", uuid2);
                                                        U3.a aVar = new U3.a(uuid2, str17);
                                                        U3.c p11 = workDatabase2.p();
                                                        p11.getClass();
                                                        S d16 = L0.d();
                                                        if (d16 != null) {
                                                            str7 = str;
                                                            s13 = d16.v(str4, str7);
                                                        } else {
                                                            str7 = str;
                                                            s13 = null;
                                                        }
                                                        ((y) p11.f17396Z).b();
                                                        ((y) p11.f17396Z).c();
                                                        ((x3.g) p11.f17397h0).i(aVar);
                                                        ((y) p11.f17396Z).n();
                                                        if (s13 != null) {
                                                            s13.c(C1.OK);
                                                        }
                                                        ((y) p11.f17396Z).j();
                                                        if (s13 != null) {
                                                            s13.b();
                                                        }
                                                        i17++;
                                                        str = str7;
                                                    }
                                                    str5 = str;
                                                } else {
                                                    str5 = str;
                                                    strArr2 = strArr;
                                                }
                                                U3.u v10 = workDatabase2.v();
                                                String uuid3 = uuid.toString();
                                                AbstractC3557B.b0("id.toString()", uuid3);
                                                v10.getClass();
                                                Set<String> set = d15.f10682c;
                                                AbstractC3557B.c0("tags", set);
                                                for (String str18 : set) {
                                                    U3.t tVar = new U3.t(str18, uuid3);
                                                    S d17 = L0.d();
                                                    if (d17 != null) {
                                                        s12 = d17.v(str4, "androidx.work.impl.model.WorkTagDao");
                                                    } else {
                                                        s12 = null;
                                                    }
                                                    ((y) v10.f17492Z).b();
                                                    ((y) v10.f17492Z).c();
                                                    ((x3.g) v10.f17493h0).i(tVar);
                                                    ((y) v10.f17492Z).n();
                                                    if (s12 != null) {
                                                        s12.c(C1.OK);
                                                    }
                                                    ((y) v10.f17492Z).j();
                                                    if (s12 != null) {
                                                        s12.b();
                                                    }
                                                }
                                                if (!z16) {
                                                    U3.l s15 = workDatabase2.s();
                                                    String uuid4 = uuid.toString();
                                                    AbstractC3557B.b0("id.toString()", uuid4);
                                                    str6 = str3;
                                                    U3.k kVar = new U3.k(str6, uuid4);
                                                    s15.getClass();
                                                    S d18 = L0.d();
                                                    if (d18 != null) {
                                                        s11 = d18.v(str4, "androidx.work.impl.model.WorkNameDao");
                                                    } else {
                                                        s11 = null;
                                                    }
                                                    ((y) s15.f17423Z).b();
                                                    ((y) s15.f17423Z).c();
                                                    ((x3.g) s15.f17424h0).i(kVar);
                                                    ((y) s15.f17423Z).n();
                                                    if (s11 != null) {
                                                        s11.c(C1.OK);
                                                    }
                                                    ((y) s15.f17423Z).j();
                                                    if (s11 != null) {
                                                        s11.b();
                                                    }
                                                } else {
                                                    str6 = str3;
                                                }
                                                str9 = str6;
                                                str11 = str4;
                                                str = str5;
                                                z17 = z19;
                                                it = it2;
                                                currentTimeMillis = j6;
                                                f11 = f10;
                                                xVar2 = xVar;
                                                workDatabase4 = workDatabase2;
                                                z10 = z18;
                                            } else {
                                                xVar = xVar2;
                                                z19 = z17;
                                                it2 = it;
                                            }
                                            d10 = d13;
                                            f10 = f11;
                                            strArr = strArr2;
                                            str3 = str9;
                                            j6 = currentTimeMillis;
                                            z18 = z10;
                                            workDatabase2 = workDatabase4;
                                            sVar = u12;
                                            str2 = str11;
                                            sVar.getClass();
                                            d11 = L0.d();
                                            if (d11 == null) {
                                            }
                                            U3.s sVar22 = sVar;
                                            y yVar2 = sVar22.f17474a;
                                            yVar2.b();
                                            yVar2.c();
                                            sVar22.f17475b.i(qVar);
                                            yVar2.n();
                                            if (s10 != null) {
                                            }
                                            yVar2.j();
                                            if (s10 != null) {
                                            }
                                            D d152 = d10;
                                            UUID uuid5 = d152.f10680a;
                                            if (!z18) {
                                            }
                                            U3.u v102 = workDatabase2.v();
                                            String uuid32 = uuid5.toString();
                                            AbstractC3557B.b0("id.toString()", uuid32);
                                            v102.getClass();
                                            Set<String> set2 = d152.f10682c;
                                            AbstractC3557B.c0("tags", set2);
                                            while (r3.hasNext()) {
                                            }
                                            if (!z16) {
                                            }
                                            str9 = str6;
                                            str11 = str4;
                                            str = str5;
                                            z17 = z19;
                                            it = it2;
                                            currentTimeMillis = j6;
                                            f11 = f10;
                                            xVar2 = xVar;
                                            workDatabase4 = workDatabase2;
                                            z10 = z18;
                                        }
                                        f6 = f11;
                                        z11 = z17;
                                        z12 = true;
                                        xVar2.f11615l = z12;
                                        workDatabase.n();
                                        workDatabase.j();
                                        if (z11) {
                                            F f13 = f6;
                                            l.a(f13.f11517f, RescheduleReceiver.class, z12);
                                            M3.v.b(f13.f11518g, f13.f11519h, f13.f11521j);
                                        }
                                        eVar2.y(z.f10734n);
                                        return;
                                    }
                                } catch (Throwable th6) {
                                    th3 = th6;
                                    eVar2 = eVar4;
                                }
                            }
                            workDatabase.j();
                            if (z11) {
                            }
                            eVar2.y(z.f10734n);
                            return;
                        } catch (Throwable th7) {
                            th2 = th7;
                            eVar = eVar2;
                            eVar.y(new L3.w(th2));
                            return;
                        }
                        eVar2 = eVar4;
                        workDatabase = workDatabase3;
                        z16 = z25;
                        str = str10;
                        z20 = false;
                        z17 = z20;
                        it = xVar2.f11612i.iterator();
                        while (it.hasNext()) {
                        }
                        f6 = f11;
                        z11 = z17;
                        z12 = true;
                        xVar2.f11615l = z12;
                        workDatabase.n();
                    } catch (Throwable th8) {
                        th3 = th8;
                        workDatabase = workDatabase3;
                    }
                } else {
                    throw new IllegalStateException("WorkContinuation has cycles (" + xVar2 + Separators.RPAREN);
                }
            } catch (Throwable th9) {
                th2 = th9;
                eVar = eVar3;
            }
        } catch (Throwable th10) {
            th2 = th10;
            eVar = eVar4;
        }
    }
}
