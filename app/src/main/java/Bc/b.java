package Bc;

import Ng.Q;
import android.app.Application;
import android.content.ComponentName;
import android.os.Build;
import com.google.android.gms.internal.play_billing.N;
import com.openai.experiment.ExperimentKey;
import com.openai.feature.voice.impl.quicktile.QuickTileService;
import com.openai.voice.assistant.AssistantActivity;
import e9.C2814g;
import jf.y;
import l8.AbstractC4344b;
import nd.AbstractC4815d;
import nd.AbstractC4816e;
import nd.EnumC4814c;
import nf.AbstractC4825e;
import of.EnumC5000a;
import wd.EnumC6181c;

/* loaded from: classes.dex */
public final class b implements AbstractC4815d {

    /* renamed from: a  reason: collision with root package name */
    public final Application f2050a;

    /* renamed from: b  reason: collision with root package name */
    public final AbstractC4816e f2051b;

    public b(Application application, AbstractC4816e abstractC4816e) {
        this.f2050a = application;
        this.f2051b = abstractC4816e;
    }

    @Override // nd.AbstractC4815d
    public final EnumC4814c a() {
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x008a A[LOOP:0: B:27:0x0084->B:29:0x008a, LOOP_END] */
    @Override // nd.AbstractC4815d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(AbstractC4825e abstractC4825e) {
        a aVar;
        int i10;
        b bVar;
        boolean booleanValue;
        int i11;
        if (abstractC4825e instanceof a) {
            aVar = (a) abstractC4825e;
            int i12 = aVar.f2049i0;
            if ((i12 & Integer.MIN_VALUE) != 0) {
                aVar.f2049i0 = i12 - Integer.MIN_VALUE;
                Object obj = aVar.f2047Z;
                EnumC5000a enumC5000a = EnumC5000a.f41328Y;
                i10 = aVar.f2049i0;
                y yVar = y.f36177a;
                if (i10 == 0) {
                    if (i10 == 1) {
                        bVar = aVar.f2046Y;
                        N.B0(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    N.B0(obj);
                    if (Build.VERSION.SDK_INT < 24) {
                        return yVar;
                    }
                    C2814g a5 = ((xc.e) this.f2051b).a(EnumC6181c.f48388k0, ExperimentKey.BreezeEnabled.INSTANCE);
                    aVar.f2046Y = this;
                    aVar.f2049i0 = 1;
                    obj = L4.a.m0(a5, aVar);
                    if (obj == enumC5000a) {
                        return enumC5000a;
                    }
                    bVar = this;
                }
                booleanValue = ((Boolean) obj).booleanValue();
                if (!booleanValue) {
                    i11 = 1;
                } else if (!booleanValue) {
                    i11 = 2;
                } else {
                    throw new RuntimeException();
                }
                ComponentName componentName = new ComponentName(bVar.f2050a, QuickTileService.class);
                Application application = bVar.f2050a;
                for (ComponentName componentName2 : AbstractC4344b.G0(componentName, new ComponentName(application, AssistantActivity.class))) {
                    application.getPackageManager().setComponentEnabledSetting(componentName2, i11, 1);
                }
                return yVar;
            }
        }
        aVar = new a(this, abstractC4825e);
        Object obj2 = aVar.f2047Z;
        EnumC5000a enumC5000a2 = EnumC5000a.f41328Y;
        i10 = aVar.f2049i0;
        y yVar2 = y.f36177a;
        if (i10 == 0) {
        }
        booleanValue = ((Boolean) obj2).booleanValue();
        if (!booleanValue) {
        }
        ComponentName componentName3 = new ComponentName(bVar.f2050a, QuickTileService.class);
        Application application2 = bVar.f2050a;
        while (r0.hasNext()) {
        }
        return yVar2;
    }

    @Override // nd.AbstractC4815d
    public final Tg.e c() {
        return Q.f12904a;
    }
}
