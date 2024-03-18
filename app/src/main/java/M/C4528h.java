package m;

import android.content.Context;
import android.content.DialogInterface;
import android.gov.nist.core.Separators;
import android.gov.nist.javax.sip.header.ParameterNames;
import android.graphics.drawable.Drawable;
import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import android.view.ContextThemeWrapper;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.TextView;
import androidx.appcompat.app.AlertController$RecycleListView;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.revenuecat.purchases.subscriberattributes.SubscriberAttributeKt;
import id.AbstractC3557B;
import io.sentry.EnumC3642e1;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.net.InetAddress;
import java.net.URI;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Collection;
import java.util.Currency;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicIntegerArray;
import livekit.org.webrtc.WebrtcBuildVersion;
import z3.C6760a;
import z3.C6761b;

/* renamed from: m.h  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4528h implements C2.w, E1.B {

    /* renamed from: Y  reason: collision with root package name */
    public int f38769Y;

    /* renamed from: Z  reason: collision with root package name */
    public Object f38770Z;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C4528h(int i10) {
        this(32, 3);
        if (i10 == 5) {
            this.f38770Z = new s2.u(8);
        } else if (i10 == 9) {
            this.f38770Z = H8.d.f7481Y;
        } else if (i10 == 12) {
            this.f38770Z = new io.sentry.android.core.z[6];
        } else if (i10 != 14) {
        } else {
            this.f38769Y = 0;
            this.f38770Z = new StringBuilder();
        }
    }

    public static C4528h j() {
        return new C4528h(9);
    }

    public static void l(C3.b bVar) {
        bVar.t("CREATE TABLE IF NOT EXISTS `Dependency` (`work_spec_id` TEXT NOT NULL, `prerequisite_id` TEXT NOT NULL, PRIMARY KEY(`work_spec_id`, `prerequisite_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE , FOREIGN KEY(`prerequisite_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
        bVar.t("CREATE INDEX IF NOT EXISTS `index_Dependency_work_spec_id` ON `Dependency` (`work_spec_id`)");
        bVar.t("CREATE INDEX IF NOT EXISTS `index_Dependency_prerequisite_id` ON `Dependency` (`prerequisite_id`)");
        bVar.t("CREATE TABLE IF NOT EXISTS `WorkSpec` (`id` TEXT NOT NULL, `state` INTEGER NOT NULL, `worker_class_name` TEXT NOT NULL, `input_merger_class_name` TEXT NOT NULL, `input` BLOB NOT NULL, `output` BLOB NOT NULL, `initial_delay` INTEGER NOT NULL, `interval_duration` INTEGER NOT NULL, `flex_duration` INTEGER NOT NULL, `run_attempt_count` INTEGER NOT NULL, `backoff_policy` INTEGER NOT NULL, `backoff_delay_duration` INTEGER NOT NULL, `last_enqueue_time` INTEGER NOT NULL DEFAULT -1, `minimum_retention_duration` INTEGER NOT NULL, `schedule_requested_at` INTEGER NOT NULL, `run_in_foreground` INTEGER NOT NULL, `out_of_quota_policy` INTEGER NOT NULL, `period_count` INTEGER NOT NULL DEFAULT 0, `generation` INTEGER NOT NULL DEFAULT 0, `next_schedule_time_override` INTEGER NOT NULL DEFAULT 9223372036854775807, `next_schedule_time_override_generation` INTEGER NOT NULL DEFAULT 0, `stop_reason` INTEGER NOT NULL DEFAULT -256, `required_network_type` INTEGER NOT NULL, `requires_charging` INTEGER NOT NULL, `requires_device_idle` INTEGER NOT NULL, `requires_battery_not_low` INTEGER NOT NULL, `requires_storage_not_low` INTEGER NOT NULL, `trigger_content_update_delay` INTEGER NOT NULL, `trigger_max_content_delay` INTEGER NOT NULL, `content_uri_triggers` BLOB NOT NULL, PRIMARY KEY(`id`))");
        bVar.t("CREATE INDEX IF NOT EXISTS `index_WorkSpec_schedule_requested_at` ON `WorkSpec` (`schedule_requested_at`)");
        bVar.t("CREATE INDEX IF NOT EXISTS `index_WorkSpec_last_enqueue_time` ON `WorkSpec` (`last_enqueue_time`)");
        bVar.t("CREATE TABLE IF NOT EXISTS `WorkTag` (`tag` TEXT NOT NULL, `work_spec_id` TEXT NOT NULL, PRIMARY KEY(`tag`, `work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
        bVar.t("CREATE INDEX IF NOT EXISTS `index_WorkTag_work_spec_id` ON `WorkTag` (`work_spec_id`)");
        bVar.t("CREATE TABLE IF NOT EXISTS `SystemIdInfo` (`work_spec_id` TEXT NOT NULL, `generation` INTEGER NOT NULL DEFAULT 0, `system_id` INTEGER NOT NULL, PRIMARY KEY(`work_spec_id`, `generation`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
        bVar.t("CREATE TABLE IF NOT EXISTS `WorkName` (`name` TEXT NOT NULL, `work_spec_id` TEXT NOT NULL, PRIMARY KEY(`name`, `work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
        bVar.t("CREATE INDEX IF NOT EXISTS `index_WorkName_work_spec_id` ON `WorkName` (`work_spec_id`)");
        bVar.t("CREATE TABLE IF NOT EXISTS `WorkProgress` (`work_spec_id` TEXT NOT NULL, `progress` BLOB NOT NULL, PRIMARY KEY(`work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
        bVar.t("CREATE TABLE IF NOT EXISTS `Preference` (`key` TEXT NOT NULL, `long_value` INTEGER, PRIMARY KEY(`key`))");
        bVar.t("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        bVar.t("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '7d73d21f1bd82c9e5268b6dcf9fde2cb')");
    }

    public static x3.z p(C3.b bVar) {
        HashMap hashMap = new HashMap(2);
        hashMap.put("work_spec_id", new C6760a(1, 1, "work_spec_id", "TEXT", null, true));
        hashMap.put("prerequisite_id", new C6760a(2, 1, "prerequisite_id", "TEXT", null, true));
        HashSet hashSet = new HashSet(2);
        hashSet.add(new C6761b("WorkSpec", "CASCADE", "CASCADE", Arrays.asList("work_spec_id"), Arrays.asList(ParameterNames.ID)));
        hashSet.add(new C6761b("WorkSpec", "CASCADE", "CASCADE", Arrays.asList("prerequisite_id"), Arrays.asList(ParameterNames.ID)));
        HashSet hashSet2 = new HashSet(2);
        hashSet2.add(new z3.d("index_Dependency_work_spec_id", false, Arrays.asList("work_spec_id"), Arrays.asList("ASC")));
        hashSet2.add(new z3.d("index_Dependency_prerequisite_id", false, Arrays.asList("prerequisite_id"), Arrays.asList("ASC")));
        z3.e eVar = new z3.e("Dependency", hashMap, hashSet, hashSet2);
        z3.e a5 = z3.e.a(bVar, "Dependency");
        if (!eVar.equals(a5)) {
            return new x3.z("Dependency(androidx.work.impl.model.Dependency).\n Expected:\n" + eVar + "\n Found:\n" + a5, 0, false);
        }
        HashMap hashMap2 = new HashMap(30);
        hashMap2.put(ParameterNames.ID, new C6760a(1, 1, ParameterNames.ID, "TEXT", null, true));
        hashMap2.put("state", new C6760a(0, 1, "state", "INTEGER", null, true));
        hashMap2.put("worker_class_name", new C6760a(0, 1, "worker_class_name", "TEXT", null, true));
        hashMap2.put("input_merger_class_name", new C6760a(0, 1, "input_merger_class_name", "TEXT", null, true));
        hashMap2.put("input", new C6760a(0, 1, "input", "BLOB", null, true));
        hashMap2.put("output", new C6760a(0, 1, "output", "BLOB", null, true));
        hashMap2.put("initial_delay", new C6760a(0, 1, "initial_delay", "INTEGER", null, true));
        hashMap2.put("interval_duration", new C6760a(0, 1, "interval_duration", "INTEGER", null, true));
        hashMap2.put("flex_duration", new C6760a(0, 1, "flex_duration", "INTEGER", null, true));
        hashMap2.put("run_attempt_count", new C6760a(0, 1, "run_attempt_count", "INTEGER", null, true));
        hashMap2.put("backoff_policy", new C6760a(0, 1, "backoff_policy", "INTEGER", null, true));
        hashMap2.put("backoff_delay_duration", new C6760a(0, 1, "backoff_delay_duration", "INTEGER", null, true));
        hashMap2.put("last_enqueue_time", new C6760a(0, 1, "last_enqueue_time", "INTEGER", "-1", true));
        hashMap2.put("minimum_retention_duration", new C6760a(0, 1, "minimum_retention_duration", "INTEGER", null, true));
        hashMap2.put("schedule_requested_at", new C6760a(0, 1, "schedule_requested_at", "INTEGER", null, true));
        hashMap2.put("run_in_foreground", new C6760a(0, 1, "run_in_foreground", "INTEGER", null, true));
        hashMap2.put("out_of_quota_policy", new C6760a(0, 1, "out_of_quota_policy", "INTEGER", null, true));
        hashMap2.put("period_count", new C6760a(0, 1, "period_count", "INTEGER", WebrtcBuildVersion.maint_version, true));
        hashMap2.put("generation", new C6760a(0, 1, "generation", "INTEGER", WebrtcBuildVersion.maint_version, true));
        hashMap2.put("next_schedule_time_override", new C6760a(0, 1, "next_schedule_time_override", "INTEGER", "9223372036854775807", true));
        hashMap2.put("next_schedule_time_override_generation", new C6760a(0, 1, "next_schedule_time_override_generation", "INTEGER", WebrtcBuildVersion.maint_version, true));
        hashMap2.put("stop_reason", new C6760a(0, 1, "stop_reason", "INTEGER", "-256", true));
        hashMap2.put("required_network_type", new C6760a(0, 1, "required_network_type", "INTEGER", null, true));
        hashMap2.put("requires_charging", new C6760a(0, 1, "requires_charging", "INTEGER", null, true));
        hashMap2.put("requires_device_idle", new C6760a(0, 1, "requires_device_idle", "INTEGER", null, true));
        hashMap2.put("requires_battery_not_low", new C6760a(0, 1, "requires_battery_not_low", "INTEGER", null, true));
        hashMap2.put("requires_storage_not_low", new C6760a(0, 1, "requires_storage_not_low", "INTEGER", null, true));
        hashMap2.put("trigger_content_update_delay", new C6760a(0, 1, "trigger_content_update_delay", "INTEGER", null, true));
        hashMap2.put("trigger_max_content_delay", new C6760a(0, 1, "trigger_max_content_delay", "INTEGER", null, true));
        hashMap2.put("content_uri_triggers", new C6760a(0, 1, "content_uri_triggers", "BLOB", null, true));
        HashSet hashSet3 = new HashSet(0);
        HashSet hashSet4 = new HashSet(2);
        hashSet4.add(new z3.d("index_WorkSpec_schedule_requested_at", false, Arrays.asList("schedule_requested_at"), Arrays.asList("ASC")));
        hashSet4.add(new z3.d("index_WorkSpec_last_enqueue_time", false, Arrays.asList("last_enqueue_time"), Arrays.asList("ASC")));
        z3.e eVar2 = new z3.e("WorkSpec", hashMap2, hashSet3, hashSet4);
        z3.e a10 = z3.e.a(bVar, "WorkSpec");
        if (!eVar2.equals(a10)) {
            return new x3.z("WorkSpec(androidx.work.impl.model.WorkSpec).\n Expected:\n" + eVar2 + "\n Found:\n" + a10, 0, false);
        }
        HashMap hashMap3 = new HashMap(2);
        hashMap3.put(ParameterNames.TAG, new C6760a(1, 1, ParameterNames.TAG, "TEXT", null, true));
        hashMap3.put("work_spec_id", new C6760a(2, 1, "work_spec_id", "TEXT", null, true));
        HashSet hashSet5 = new HashSet(1);
        hashSet5.add(new C6761b("WorkSpec", "CASCADE", "CASCADE", Arrays.asList("work_spec_id"), Arrays.asList(ParameterNames.ID)));
        HashSet hashSet6 = new HashSet(1);
        hashSet6.add(new z3.d("index_WorkTag_work_spec_id", false, Arrays.asList("work_spec_id"), Arrays.asList("ASC")));
        z3.e eVar3 = new z3.e("WorkTag", hashMap3, hashSet5, hashSet6);
        z3.e a11 = z3.e.a(bVar, "WorkTag");
        if (!eVar3.equals(a11)) {
            return new x3.z("WorkTag(androidx.work.impl.model.WorkTag).\n Expected:\n" + eVar3 + "\n Found:\n" + a11, 0, false);
        }
        HashMap hashMap4 = new HashMap(3);
        hashMap4.put("work_spec_id", new C6760a(1, 1, "work_spec_id", "TEXT", null, true));
        hashMap4.put("generation", new C6760a(2, 1, "generation", "INTEGER", WebrtcBuildVersion.maint_version, true));
        hashMap4.put("system_id", new C6760a(0, 1, "system_id", "INTEGER", null, true));
        HashSet hashSet7 = new HashSet(1);
        hashSet7.add(new C6761b("WorkSpec", "CASCADE", "CASCADE", Arrays.asList("work_spec_id"), Arrays.asList(ParameterNames.ID)));
        z3.e eVar4 = new z3.e("SystemIdInfo", hashMap4, hashSet7, new HashSet(0));
        z3.e a12 = z3.e.a(bVar, "SystemIdInfo");
        if (!eVar4.equals(a12)) {
            return new x3.z("SystemIdInfo(androidx.work.impl.model.SystemIdInfo).\n Expected:\n" + eVar4 + "\n Found:\n" + a12, 0, false);
        }
        HashMap hashMap5 = new HashMap(2);
        hashMap5.put("name", new C6760a(1, 1, "name", "TEXT", null, true));
        hashMap5.put("work_spec_id", new C6760a(2, 1, "work_spec_id", "TEXT", null, true));
        HashSet hashSet8 = new HashSet(1);
        hashSet8.add(new C6761b("WorkSpec", "CASCADE", "CASCADE", Arrays.asList("work_spec_id"), Arrays.asList(ParameterNames.ID)));
        HashSet hashSet9 = new HashSet(1);
        hashSet9.add(new z3.d("index_WorkName_work_spec_id", false, Arrays.asList("work_spec_id"), Arrays.asList("ASC")));
        z3.e eVar5 = new z3.e("WorkName", hashMap5, hashSet8, hashSet9);
        z3.e a13 = z3.e.a(bVar, "WorkName");
        if (!eVar5.equals(a13)) {
            return new x3.z("WorkName(androidx.work.impl.model.WorkName).\n Expected:\n" + eVar5 + "\n Found:\n" + a13, 0, false);
        }
        HashMap hashMap6 = new HashMap(2);
        hashMap6.put("work_spec_id", new C6760a(1, 1, "work_spec_id", "TEXT", null, true));
        hashMap6.put("progress", new C6760a(0, 1, "progress", "BLOB", null, true));
        HashSet hashSet10 = new HashSet(1);
        hashSet10.add(new C6761b("WorkSpec", "CASCADE", "CASCADE", Arrays.asList("work_spec_id"), Arrays.asList(ParameterNames.ID)));
        z3.e eVar6 = new z3.e("WorkProgress", hashMap6, hashSet10, new HashSet(0));
        z3.e a14 = z3.e.a(bVar, "WorkProgress");
        if (!eVar6.equals(a14)) {
            return new x3.z("WorkProgress(androidx.work.impl.model.WorkProgress).\n Expected:\n" + eVar6 + "\n Found:\n" + a14, 0, false);
        }
        HashMap hashMap7 = new HashMap(2);
        hashMap7.put(SubscriberAttributeKt.JSON_NAME_KEY, new C6760a(1, 1, SubscriberAttributeKt.JSON_NAME_KEY, "TEXT", null, true));
        hashMap7.put("long_value", new C6760a(0, 1, "long_value", "INTEGER", null, false));
        z3.e eVar7 = new z3.e("Preference", hashMap7, new HashSet(0), new HashSet(0));
        z3.e a15 = z3.e.a(bVar, "Preference");
        if (!eVar7.equals(a15)) {
            return new x3.z("Preference(androidx.work.impl.model.Preference).\n Expected:\n" + eVar7 + "\n Found:\n" + a15, 0, false);
        }
        return new x3.z(null, 0, true);
    }

    @Override // C2.w
    public final MediaCodecInfo a(int i10) {
        if (((MediaCodecInfo[]) this.f38770Z) == null) {
            this.f38770Z = new MediaCodecList(this.f38769Y).getCodecInfos();
        }
        return ((MediaCodecInfo[]) this.f38770Z)[i10];
    }

    @Override // E1.B
    public final boolean b(View view) {
        ((BottomSheetBehavior) this.f38770Z).B(this.f38769Y);
        return true;
    }

    @Override // C2.w
    public final boolean c(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return codecCapabilities.isFeatureSupported(str);
    }

    @Override // C2.w
    public final boolean d(String str, MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return codecCapabilities.isFeatureRequired(str);
    }

    @Override // C2.w
    public final int e() {
        if (((MediaCodecInfo[]) this.f38770Z) == null) {
            this.f38770Z = new MediaCodecList(this.f38769Y).getCodecInfos();
        }
        return ((MediaCodecInfo[]) this.f38770Z).length;
    }

    @Override // C2.w
    public final boolean f() {
        return true;
    }

    public final void g(long j6) {
        int i10 = this.f38769Y;
        Object obj = this.f38770Z;
        if (i10 == ((long[]) obj).length) {
            this.f38770Z = Arrays.copyOf((long[]) obj, i10 * 2);
        }
        int i11 = this.f38769Y;
        this.f38769Y = i11 + 1;
        ((long[]) this.f38770Z)[i11] = j6;
    }

    public final void h(io.sentry.android.core.z zVar) {
        while (zVar != null) {
            int i10 = 0;
            while (true) {
                int i11 = this.f38769Y;
                if (i10 < i11) {
                    if (((String) ((io.sentry.android.core.z[]) this.f38770Z)[i10].f34263Y).equals((String) zVar.f34263Y)) {
                        break;
                    }
                    i10++;
                } else {
                    io.sentry.android.core.z[] zVarArr = (io.sentry.android.core.z[]) this.f38770Z;
                    if (i11 >= zVarArr.length) {
                        io.sentry.android.core.z[] zVarArr2 = new io.sentry.android.core.z[zVarArr.length + 6];
                        System.arraycopy(zVarArr, 0, zVarArr2, 0, i11);
                        this.f38770Z = zVarArr2;
                    }
                    int i12 = this.f38769Y;
                    this.f38769Y = i12 + 1;
                    ((io.sentry.android.core.z[]) this.f38770Z)[i12] = zVar;
                }
            }
            zVar = (io.sentry.android.core.z) zVar.f34265h0;
        }
    }

    public final H8.a i() {
        return new H8.a(this.f38769Y, (H8.d) this.f38770Z);
    }

    public final DialogInterfaceC4529i k() {
        int i10;
        DialogInterfaceC4529i dialogInterfaceC4529i = new DialogInterfaceC4529i(((C4524d) this.f38770Z).f38733a, this.f38769Y);
        C4524d c4524d = (C4524d) this.f38770Z;
        View view = c4524d.f38737e;
        C4527g c4527g = dialogInterfaceC4529i.f38773k0;
        if (view != null) {
            c4527g.f38759o = view;
        } else {
            CharSequence charSequence = c4524d.f38736d;
            if (charSequence != null) {
                c4527g.f38748d = charSequence;
                TextView textView = c4527g.f38757m;
                if (textView != null) {
                    textView.setText(charSequence);
                }
            }
            Drawable drawable = c4524d.f38735c;
            if (drawable != null) {
                c4527g.f38755k = drawable;
                c4527g.f38754j = 0;
                ImageView imageView = c4527g.f38756l;
                if (imageView != null) {
                    imageView.setVisibility(0);
                    c4527g.f38756l.setImageDrawable(drawable);
                }
            }
        }
        if (c4524d.f38739g != null) {
            AlertController$RecycleListView alertController$RecycleListView = (AlertController$RecycleListView) c4524d.f38734b.inflate(c4527g.f38763s, (ViewGroup) null);
            if (c4524d.f38741i) {
                i10 = c4527g.f38764t;
            } else {
                i10 = c4527g.f38765u;
            }
            ListAdapter listAdapter = c4524d.f38739g;
            if (listAdapter == null) {
                listAdapter = new ArrayAdapter(c4524d.f38733a, i10, 16908308, (Object[]) null);
            }
            c4527g.f38760p = listAdapter;
            c4527g.f38761q = c4524d.f38742j;
            if (c4524d.f38740h != null) {
                alertController$RecycleListView.setOnItemClickListener(new C4523c(c4524d, 0, c4527g));
            }
            if (c4524d.f38741i) {
                alertController$RecycleListView.setChoiceMode(1);
            }
            c4527g.f38749e = alertController$RecycleListView;
        }
        ((C4524d) this.f38770Z).getClass();
        dialogInterfaceC4529i.setCancelable(true);
        ((C4524d) this.f38770Z).getClass();
        dialogInterfaceC4529i.setCanceledOnTouchOutside(true);
        ((C4524d) this.f38770Z).getClass();
        dialogInterfaceC4529i.setOnCancelListener(null);
        ((C4524d) this.f38770Z).getClass();
        dialogInterfaceC4529i.setOnDismissListener(null);
        DialogInterface.OnKeyListener onKeyListener = ((C4524d) this.f38770Z).f38738f;
        if (onKeyListener != null) {
            dialogInterfaceC4529i.setOnKeyListener(onKeyListener);
        }
        return dialogInterfaceC4529i;
    }

    public final long m(int i10) {
        if (i10 >= 0 && i10 < this.f38769Y) {
            return ((long[]) this.f38770Z)[i10];
        }
        StringBuilder q10 = android.gov.nist.core.a.q("Invalid index ", i10, ", size is ");
        q10.append(this.f38769Y);
        throw new IndexOutOfBoundsException(q10.toString());
    }

    public final boolean n() {
        if (this.f38769Y < ((List) this.f38770Z).size()) {
            return true;
        }
        return false;
    }

    public final HashMap o(Map map, io.sentry.H h10) {
        HashMap hashMap = new HashMap();
        for (Object obj : map.keySet()) {
            Object obj2 = map.get(obj);
            if (obj2 != null) {
                hashMap.put(obj.toString(), v(h10, obj2));
            } else {
                hashMap.put(obj.toString(), null);
            }
        }
        return hashMap;
    }

    public final int q() {
        int i10 = this.f38769Y - 1;
        this.f38769Y = i10;
        return ((int[]) this.f38770Z)[i10];
    }

    public final void r(int i10, int i11, int i12) {
        int i13 = this.f38769Y;
        int i14 = i13 + 3;
        Object obj = this.f38770Z;
        if (i14 >= ((int[]) obj).length) {
            int[] copyOf = Arrays.copyOf((int[]) obj, ((int[]) obj).length * 2);
            AbstractC3557B.b0("copyOf(this, newSize)", copyOf);
            this.f38770Z = copyOf;
        }
        int[] iArr = (int[]) this.f38770Z;
        iArr[i13] = i10 + i12;
        iArr[i13 + 1] = i11 + i12;
        iArr[i13 + 2] = i12;
        this.f38769Y = i14;
    }

    public final void s(int i10, int i11, int i12, int i13) {
        int i14 = this.f38769Y;
        int i15 = i14 + 4;
        Object obj = this.f38770Z;
        if (i15 >= ((int[]) obj).length) {
            int[] copyOf = Arrays.copyOf((int[]) obj, ((int[]) obj).length * 2);
            AbstractC3557B.b0("copyOf(this, newSize)", copyOf);
            this.f38770Z = copyOf;
        }
        int[] iArr = (int[]) this.f38770Z;
        iArr[i14] = i10;
        iArr[i14 + 1] = i11;
        iArr[i14 + 2] = i12;
        iArr[i14 + 3] = i13;
        this.f38769Y = i15;
    }

    public final void t(int i10, int i11) {
        if (i10 < i11) {
            int i12 = i10 - 3;
            for (int i13 = i10; i13 < i11; i13 += 3) {
                int[] iArr = (int[]) this.f38770Z;
                int i14 = iArr[i13];
                int i15 = iArr[i11];
                if (i14 < i15 || (i14 == i15 && iArr[i13 + 1] <= iArr[i11 + 1])) {
                    i12 += 3;
                    x(i12, i13);
                }
            }
            x(i12 + 3, i11);
            t(i10, i12);
            t(i12 + 6, i11);
        }
    }

    public final long u(L2.r rVar) {
        int i10 = 0;
        rVar.n(((s2.u) this.f38770Z).f45193a, 0, 1);
        int i11 = ((s2.u) this.f38770Z).f45193a[0] & 255;
        if (i11 == 0) {
            return Long.MIN_VALUE;
        }
        int i12 = 128;
        int i13 = 0;
        while ((i11 & i12) == 0) {
            i12 >>= 1;
            i13++;
        }
        int i14 = i11 & (~i12);
        rVar.n(((s2.u) this.f38770Z).f45193a, 1, i13);
        while (i10 < i13) {
            i10++;
            i14 = (((s2.u) this.f38770Z).f45193a[i10] & 255) + (i14 << 8);
        }
        this.f38769Y = i13 + 1 + this.f38769Y;
        return i14;
    }

    public final Object v(io.sentry.H h10, Object obj) {
        Object obj2;
        ArrayList arrayList = null;
        if (obj == null) {
            return null;
        }
        if (obj instanceof Character) {
            return obj.toString();
        }
        if (obj instanceof Number) {
            return obj;
        }
        if (obj instanceof Boolean) {
            return obj;
        }
        if (obj instanceof String) {
            return obj;
        }
        if (obj instanceof Locale) {
            return obj.toString();
        }
        int i10 = 0;
        if (obj instanceof AtomicIntegerArray) {
            AtomicIntegerArray atomicIntegerArray = (AtomicIntegerArray) obj;
            Charset charset = io.sentry.util.b.f34772a;
            int length = atomicIntegerArray.length();
            ArrayList arrayList2 = new ArrayList(length);
            while (i10 < length) {
                arrayList2.add(Integer.valueOf(atomicIntegerArray.get(i10)));
                i10++;
            }
            return arrayList2;
        } else if (obj instanceof AtomicBoolean) {
            return Boolean.valueOf(((AtomicBoolean) obj).get());
        } else {
            if (obj instanceof URI) {
                return obj.toString();
            }
            if (obj instanceof InetAddress) {
                return obj.toString();
            }
            if (obj instanceof UUID) {
                return obj.toString();
            }
            if (obj instanceof Currency) {
                return obj.toString();
            }
            if (obj instanceof Calendar) {
                return io.sentry.util.b.a((Calendar) obj);
            }
            if (obj.getClass().isEnum()) {
                return obj.toString();
            }
            if (((Set) this.f38770Z).contains(obj)) {
                h10.f(EnumC3642e1.INFO, "Cyclic reference detected. Calling toString() on object.", new Object[0]);
                return obj.toString();
            }
            ((Set) this.f38770Z).add(obj);
            try {
                if (((Set) this.f38770Z).size() > this.f38769Y) {
                    ((Set) this.f38770Z).remove(obj);
                    h10.f(EnumC3642e1.INFO, "Max depth exceeded. Calling toString() on object.", new Object[0]);
                    return obj.toString();
                }
                try {
                    if (obj.getClass().isArray()) {
                        Object[] objArr = (Object[]) obj;
                        ArrayList arrayList3 = new ArrayList();
                        int length2 = objArr.length;
                        while (i10 < length2) {
                            arrayList3.add(v(h10, objArr[i10]));
                            i10++;
                        }
                        arrayList = arrayList3;
                    } else if (obj instanceof Collection) {
                        ArrayList arrayList4 = new ArrayList();
                        for (Object obj3 : (Collection) obj) {
                            arrayList4.add(v(h10, obj3));
                        }
                        arrayList = arrayList4;
                    } else {
                        if (obj instanceof Map) {
                            obj2 = o((Map) obj, h10);
                        } else {
                            HashMap w10 = w(h10, obj);
                            if (w10.isEmpty()) {
                                obj2 = obj.toString();
                            } else {
                                arrayList = w10;
                            }
                        }
                        arrayList = obj2;
                    }
                } catch (Exception e10) {
                    h10.d(EnumC3642e1.INFO, "Not serializing object due to throwing sub-path.", e10);
                }
                return arrayList;
            } finally {
                ((Set) this.f38770Z).remove(obj);
            }
        }
    }

    public final HashMap w(io.sentry.H h10, Object obj) {
        Field[] declaredFields = obj.getClass().getDeclaredFields();
        HashMap hashMap = new HashMap();
        for (Field field : declaredFields) {
            if (!Modifier.isTransient(field.getModifiers()) && !Modifier.isStatic(field.getModifiers())) {
                String name = field.getName();
                try {
                    field.setAccessible(true);
                    hashMap.put(name, v(h10, field.get(obj)));
                    field.setAccessible(false);
                } catch (Exception unused) {
                    h10.f(EnumC3642e1.INFO, android.gov.nist.core.a.A("Cannot access field ", name, Separators.DOT), new Object[0]);
                }
            }
        }
        return hashMap;
    }

    public final void x(int i10, int i11) {
        int[] iArr = (int[]) this.f38770Z;
        int i12 = iArr[i10];
        iArr[i10] = iArr[i11];
        iArr[i11] = i12;
        int i13 = i10 + 1;
        int i14 = i11 + 1;
        int i15 = iArr[i13];
        iArr[i13] = iArr[i14];
        iArr[i14] = i15;
        int i16 = i10 + 2;
        int i17 = i11 + 2;
        int i18 = iArr[i16];
        iArr[i16] = iArr[i17];
        iArr[i17] = i18;
    }

    public C4528h(int i10, int i11) {
        if (i11 == 3) {
            this.f38770Z = new long[i10];
        } else if (i11 != 10) {
            this.f38770Z = new int[i10];
        } else {
            this.f38770Z = new HashSet();
            this.f38769Y = i10;
        }
    }

    public /* synthetic */ C4528h(int i10, Object obj) {
        this.f38770Z = obj;
        this.f38769Y = i10;
    }

    public C4528h(Context context) {
        int o10 = DialogInterfaceC4529i.o(context, 0);
        this.f38770Z = new C4524d(new ContextThemeWrapper(context, DialogInterfaceC4529i.o(context, o10)));
        this.f38769Y = o10;
    }
}
