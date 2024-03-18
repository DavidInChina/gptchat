package com.statsig.androidsdk;

import Ng.F;
import android.content.SharedPreferences;
import com.google.android.gms.internal.play_billing.N;
import jf.y;
import kotlin.Metadata;
import nf.AbstractC4825e;
import of.EnumC5000a;
import pf.AbstractC5158e;
import pf.AbstractC5163j;
import wf.n;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@\u00a2\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LNg/F;", "Ljf/y;", "<anonymous>", "(LNg/F;)V"}, k = 3, mv = {1, 5, 1})
@AbstractC5158e(c = "com.statsig.androidsdk.StatsigUtil$saveStringToSharedPrefs$2", f = "StatsigUtil.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class StatsigUtil$saveStringToSharedPrefs$2 extends AbstractC5163j implements n {
    final /* synthetic */ String $key;
    final /* synthetic */ SharedPreferences $sharedPrefs;
    final /* synthetic */ String $value;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StatsigUtil$saveStringToSharedPrefs$2(SharedPreferences sharedPreferences, String str, String str2, AbstractC4825e abstractC4825e) {
        super(2, abstractC4825e);
        this.$sharedPrefs = sharedPreferences;
        this.$key = str;
        this.$value = str2;
    }

    @Override // pf.AbstractC5154a
    public final AbstractC4825e create(Object obj, AbstractC4825e abstractC4825e) {
        return new StatsigUtil$saveStringToSharedPrefs$2(this.$sharedPrefs, this.$key, this.$value, abstractC4825e);
    }

    public final Object invoke(F f6, AbstractC4825e abstractC4825e) {
        return ((StatsigUtil$saveStringToSharedPrefs$2) create(f6, abstractC4825e)).invokeSuspend(y.f36177a);
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        EnumC5000a enumC5000a = EnumC5000a.f41328Y;
        if (this.label == 0) {
            N.B0(obj);
            SharedPreferences.Editor edit = this.$sharedPrefs.edit();
            edit.putString(this.$key, this.$value);
            edit.apply();
            return y.f36177a;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
