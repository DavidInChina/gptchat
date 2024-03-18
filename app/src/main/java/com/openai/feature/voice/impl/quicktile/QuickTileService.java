package com.openai.feature.voice.impl.quicktile;

import Bc.e;
import Uc.C1422g;
import Uc.EnumC1421f;
import Z8.AbstractC1809m0;
import Z8.C1788c;
import Z8.C1792e;
import Z8.C1798h;
import android.app.PendingIntent;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Build;
import android.service.quicksettings.TileService;
import com.openai.experiment.ExperimentKey;
import com.openai.experiment.G;
import com.openai.experiment.l;
import com.openai.experiment.r;
import com.openai.experiment.t;
import com.openai.voice.assistant.AssistantActivity;
import dd.AbstractC2625a;
import ed.C2877c;
import f9.C2962n;
import id.AbstractC3557B;
import kf.w;
import kotlin.Metadata;
import l8.AbstractC4344b;
import ld.g;
import ld.h;
import x8.W;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\b\u0002\u0010\u0003\u00a8\u0006\u0004"}, d2 = {"Lcom/openai/feature/voice/impl/quicktile/QuickTileService;", "Landroid/service/quicksettings/TileService;", "<init>", "()V", "impl_googlePlayRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class QuickTileService extends TileService {
    public final void a(e eVar) {
        Intent intent;
        C2962n c2962n = (C2962n) eVar;
        t c10 = c2962n.c();
        r rVar = (r) c2962n.f29839i.get();
        if (((Boolean) ((C2877c) ((AbstractC2625a) c2962n.f29827c.f29893X.get())).f29281c.getValue()).booleanValue()) {
            C1422g c1422g = C1422g.f17674i;
            intent = W.D(this, C1422g.r1(EnumC1421f.f17668Y), AbstractC4344b.G0(268435456, 131072));
        } else {
            intent = new Intent(this, AssistantActivity.class).addFlags(268435456).addFlags(134217728).addFlags(8388608).addFlags(1073741824);
        }
        if (intent != null) {
            if (((G) c10).c(ExperimentKey.QuickTileAssistantGPTEnabled.INSTANCE)) {
                intent.putExtra("gizmoId", ((G) rVar).b(l.f27690c));
            }
            if (Build.VERSION.SDK_INT >= 34) {
                startActivityAndCollapse(PendingIntent.getActivity(this, 0, intent, 67108864));
            } else {
                startActivityAndCollapse(intent);
            }
        }
    }

    public final void onClick() {
        PackageManager packageManager;
        String packageName;
        AbstractC1809m0.a().b(C1792e.f23341c, w.f37484Y);
        try {
            Object b10 = g.f38286a.b(e.class);
            if (b10 != null) {
                a((e) b10);
                return;
            }
            throw new h("Couldn't find component of type ".concat(e.class.getName()));
        } catch (h unused) {
            packageManager = getPackageManager();
            packageName = getPackageName();
            Intent launchIntentForPackage = packageManager.getLaunchIntentForPackage(packageName);
            AbstractC3557B.Z(launchIntentForPackage);
            if (Build.VERSION.SDK_INT >= 34) {
                startActivityAndCollapse(PendingIntent.getActivity(this, 0, launchIntentForPackage, 67108864));
            } else {
                startActivityAndCollapse(launchIntentForPackage);
            }
        }
    }

    public final void onTileAdded() {
        AbstractC1809m0.a().b(C1788c.f23335c, w.f37484Y);
    }

    public final void onTileRemoved() {
        AbstractC1809m0.a().b(C1798h.f23350c, w.f37484Y);
    }
}
