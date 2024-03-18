package x3;

import A.AbstractC0044t0;
import M3.C0933b;
import android.database.Cursor;
import androidx.lifecycle.D;
import androidx.work.impl.WorkDatabase_Impl;
import id.AbstractC3557B;
import io.sentry.android.core.AbstractC3612c;
import j0.C3878C;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;
import java.util.TreeMap;
import l8.AbstractC4344b;
import lf.C4436a;
import m.C4528h;
import y3.AbstractC6540b;

/* renamed from: x3.A  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6269A extends B3.c {

    /* renamed from: b  reason: collision with root package name */
    public e f48650b;

    /* renamed from: c  reason: collision with root package name */
    public final C4528h f48651c;

    /* renamed from: d  reason: collision with root package name */
    public final String f48652d = "7d73d21f1bd82c9e5268b6dcf9fde2cb";

    /* renamed from: e  reason: collision with root package name */
    public final String f48653e = "3071c8717539de5d5353f4c8cd59a032";

    public C6269A(e eVar, C4528h c4528h) {
        super(c4528h.f38769Y);
        this.f48650b = eVar;
        this.f48651c = c4528h;
    }

    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0068 A[ORIG_RETURN, RETURN] */
    @Override // B3.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void c(C3.b bVar) {
        boolean z10;
        List list;
        z p10;
        Cursor h10 = bVar.h("SELECT count(*) FROM sqlite_master WHERE name != 'android_metadata'");
        try {
            if (h10.moveToFirst()) {
                if (h10.getInt(0) == 0) {
                    z10 = true;
                    Ad.l.S(h10, null);
                    C4528h c4528h = this.f48651c;
                    c4528h.getClass();
                    C4528h.l(bVar);
                    if (!z10) {
                        if (!C4528h.p(bVar).f48763c) {
                            throw new IllegalStateException("Pre-packaged database has an invalid schema: " + p10.f48762b);
                        }
                    }
                    g(bVar);
                    list = ((WorkDatabase_Impl) c4528h.f38770Z).f48755f;
                    if (list == null) {
                        int size = list.size();
                        for (int i10 = 0; i10 < size; i10++) {
                            ((C0933b) ((WorkDatabase_Impl) c4528h.f38770Z).f48755f.get(i10)).getClass();
                        }
                        return;
                    }
                    return;
                }
            }
            z10 = false;
            Ad.l.S(h10, null);
            C4528h c4528h2 = this.f48651c;
            c4528h2.getClass();
            C4528h.l(bVar);
            if (!z10) {
            }
            g(bVar);
            list = ((WorkDatabase_Impl) c4528h2.f38770Z).f48755f;
            if (list == null) {
            }
        } catch (Throwable th2) {
            try {
                throw th2;
            } catch (Throwable th3) {
                Ad.l.S(h10, th2);
                throw th3;
            }
        }
    }

    @Override // B3.c
    public final void d(C3.b bVar, int i10, int i11) {
        f(bVar, i10, i11);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0020  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x008d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Throwable, x3.e] */
    @Override // B3.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void e(C3.b bVar) {
        boolean z10;
        n nVar;
        z p10;
        String str;
        Cursor h10 = bVar.h("SELECT 1 FROM sqlite_master WHERE type = 'table' AND name='room_master_table'");
        try {
            if (h10.moveToFirst()) {
                if (h10.getInt(0) != 0) {
                    z10 = true;
                    th = 0;
                    if (!z10) {
                        h10 = bVar.x0(new B3.a("SELECT identity_hash FROM room_master_table WHERE id = 42 LIMIT 1"));
                        try {
                            if (h10.moveToFirst()) {
                                str = h10.getString(0);
                            } else {
                                str = th;
                            }
                            Ad.l.S(h10, th);
                            String str2 = this.f48652d;
                            if (!AbstractC3557B.K(str2, str) && !AbstractC3557B.K(this.f48653e, str)) {
                                throw new IllegalStateException(android.gov.nist.core.a.k("Room cannot verify the data integrity. Looks like you've changed schema but forgot to update the version number. You can simply fix this by increasing the version number. Expected identity hash: ", str2, ", found: ", str));
                            }
                        } catch (Throwable th2) {
                            try {
                                throw th2;
                            } finally {
                            }
                        }
                    } else {
                        this.f48651c.getClass();
                        if (C4528h.p(bVar).f48763c) {
                            g(bVar);
                        } else {
                            throw new IllegalStateException("Pre-packaged database has an invalid schema: " + p10.f48762b);
                        }
                    }
                    C4528h c4528h = this.f48651c;
                    ((WorkDatabase_Impl) c4528h.f38770Z).f48750a = bVar;
                    bVar.t("PRAGMA foreign_keys = ON");
                    WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) c4528h.f38770Z;
                    workDatabase_Impl.getClass();
                    nVar = workDatabase_Impl.f48753d;
                    nVar.getClass();
                    synchronized (nVar.f48708l) {
                        if (nVar.f48703g) {
                            AbstractC3612c.c("ROOM", "Invalidation tracker is initialized twice :/.");
                        } else {
                            bVar.t("PRAGMA temp_store = MEMORY;");
                            bVar.t("PRAGMA recursive_triggers='ON';");
                            bVar.t("CREATE TEMP TABLE room_table_modification_log (table_id INTEGER PRIMARY KEY, invalidated INTEGER NOT NULL DEFAULT 0)");
                            nVar.d(bVar);
                            nVar.f48704h = bVar.x("UPDATE room_table_modification_log SET invalidated = 0 WHERE invalidated = 1");
                            nVar.f48703g = true;
                        }
                    }
                    List list = ((WorkDatabase_Impl) c4528h.f38770Z).f48755f;
                    if (list != null) {
                        int size = list.size();
                        for (int i10 = 0; i10 < size; i10++) {
                            C0933b c0933b = (C0933b) ((WorkDatabase_Impl) c4528h.f38770Z).f48755f.get(i10);
                            c0933b.getClass();
                            bVar.n();
                            try {
                                StringBuilder sb2 = new StringBuilder("DELETE FROM workspec WHERE state IN (2, 3, 5) AND (last_enqueue_time + minimum_retention_duration) < ");
                                c0933b.f11564a.getClass();
                                sb2.append(System.currentTimeMillis() - M3.z.f11618a);
                                sb2.append(" AND (SELECT COUNT(*)=0 FROM dependency WHERE     prerequisite_id=id AND     work_spec_id NOT IN         (SELECT id FROM workspec WHERE state IN (2, 3, 5)))");
                                bVar.t(sb2.toString());
                                bVar.U();
                                bVar.j0();
                            } catch (Throwable th3) {
                                bVar.j0();
                                throw th3;
                            }
                        }
                    }
                    this.f48650b = th2;
                    return;
                }
            }
            z10 = false;
            th2 = 0;
            if (!z10) {
            }
            C4528h c4528h2 = this.f48651c;
            ((WorkDatabase_Impl) c4528h2.f38770Z).f48750a = bVar;
            bVar.t("PRAGMA foreign_keys = ON");
            WorkDatabase_Impl workDatabase_Impl2 = (WorkDatabase_Impl) c4528h2.f38770Z;
            workDatabase_Impl2.getClass();
            nVar = workDatabase_Impl2.f48753d;
            nVar.getClass();
            synchronized (nVar.f48708l) {
            }
        } catch (Throwable th22) {
            try {
                throw th22;
            } finally {
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x003b A[EDGE_INSN: B:81:0x003b->B:16:0x003b ?: BREAK  , SYNTHETIC] */
    @Override // B3.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void f(C3.b bVar, int i10, int i11) {
        Iterable<AbstractC6540b> iterable;
        z p10;
        boolean z10;
        TreeMap treeMap;
        Set<Integer> set;
        boolean z11;
        e eVar = this.f48650b;
        C4528h c4528h = this.f48651c;
        if (eVar != null) {
            D d10 = eVar.f48674d;
            d10.getClass();
            if (i10 == i11) {
                iterable = kf.v.f37483Y;
            } else {
                if (i11 > i10) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                ArrayList arrayList = new ArrayList();
                int i12 = i10;
                do {
                    if (z10) {
                        if (i12 >= i11) {
                            iterable = arrayList;
                            break;
                        }
                        treeMap = (TreeMap) d10.f25290b.get(Integer.valueOf(i12));
                        if (treeMap == null) {
                            break;
                        }
                        if (z10) {
                            set = treeMap.descendingKeySet();
                        } else {
                            set = treeMap.keySet();
                        }
                        for (Integer num : set) {
                            if (z10) {
                                int i13 = i12 + 1;
                                AbstractC3557B.b0("targetVersion", num);
                                int intValue = num.intValue();
                                if (i13 <= intValue && intValue <= i11) {
                                    Object obj = treeMap.get(num);
                                    AbstractC3557B.Z(obj);
                                    arrayList.add(obj);
                                    i12 = num.intValue();
                                    z11 = true;
                                    continue;
                                    break;
                                }
                            } else {
                                AbstractC3557B.b0("targetVersion", num);
                                int intValue2 = num.intValue();
                                if (i11 <= intValue2 && intValue2 < i12) {
                                    Object obj2 = treeMap.get(num);
                                    AbstractC3557B.Z(obj2);
                                    arrayList.add(obj2);
                                    i12 = num.intValue();
                                    z11 = true;
                                    continue;
                                    break;
                                }
                            }
                        }
                        z11 = false;
                        continue;
                    } else {
                        if (i12 <= i11) {
                            iterable = arrayList;
                            break;
                        }
                        treeMap = (TreeMap) d10.f25290b.get(Integer.valueOf(i12));
                        if (treeMap == null) {
                        }
                    }
                } while (z11);
                iterable = null;
            }
            if (iterable != null) {
                c4528h.getClass();
                C4436a c4436a = new C4436a();
                Cursor h10 = bVar.h("SELECT name FROM sqlite_master WHERE type = 'trigger'");
                while (h10.moveToNext()) {
                    try {
                        c4436a.add(h10.getString(0));
                    } catch (Throwable th2) {
                        try {
                            throw th2;
                        } catch (Throwable th3) {
                            Ad.l.S(h10, th2);
                            throw th3;
                        }
                    }
                }
                Ad.l.S(h10, null);
                ListIterator listIterator = AbstractC4344b.Q(c4436a).listIterator(0);
                while (true) {
                    C3878C c3878c = (C3878C) listIterator;
                    if (!c3878c.hasNext()) {
                        break;
                    }
                    String str = (String) c3878c.next();
                    AbstractC3557B.b0("triggerName", str);
                    if (Lg.n.I2(str, "room_fts_content_sync_", false)) {
                        bVar.t("DROP TRIGGER IF EXISTS ".concat(str));
                    }
                }
                for (AbstractC6540b abstractC6540b : iterable) {
                    abstractC6540b.a(bVar);
                }
                if (C4528h.p(bVar).f48763c) {
                    g(bVar);
                    return;
                }
                throw new IllegalStateException("Migration didn't properly handle: " + p10.f48762b);
            }
        }
        e eVar2 = this.f48650b;
        if (eVar2 != null && !eVar2.a(i10, i11)) {
            c4528h.getClass();
            bVar.t("DROP TABLE IF EXISTS `Dependency`");
            bVar.t("DROP TABLE IF EXISTS `WorkSpec`");
            bVar.t("DROP TABLE IF EXISTS `WorkTag`");
            bVar.t("DROP TABLE IF EXISTS `SystemIdInfo`");
            bVar.t("DROP TABLE IF EXISTS `WorkName`");
            bVar.t("DROP TABLE IF EXISTS `WorkProgress`");
            bVar.t("DROP TABLE IF EXISTS `Preference`");
            List list = ((WorkDatabase_Impl) c4528h.f38770Z).f48755f;
            if (list != null) {
                int size = list.size();
                for (int i14 = 0; i14 < size; i14++) {
                    ((C0933b) ((WorkDatabase_Impl) c4528h.f38770Z).f48755f.get(i14)).getClass();
                }
            }
            C4528h.l(bVar);
            return;
        }
        throw new IllegalStateException(AbstractC0044t0.y("A migration from ", i10, " to ", i11, " was required but not found. Please provide the necessary Migration path via RoomDatabase.Builder.addMigration(Migration ...) or allow for destructive migrations via one of the RoomDatabase.Builder.fallbackToDestructiveMigration* methods."));
    }

    public final void g(C3.b bVar) {
        bVar.t("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        String str = this.f48652d;
        AbstractC3557B.c0("hash", str);
        bVar.t("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '" + str + "')");
    }

    @Override // B3.c
    public final void b(C3.b bVar) {
    }
}
