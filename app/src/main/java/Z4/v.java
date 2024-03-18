package z4;

import Ng.F;
import android.content.Context;
import android.content.res.AssetManager;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.util.Base64;
import com.google.android.gms.internal.play_billing.N;
import id.AbstractC3557B;
import java.io.IOException;
import java.io.InputStream;
import jf.y;
import nf.AbstractC4825e;
import of.EnumC5000a;
import pf.AbstractC5163j;
import v4.C5971a;

/* loaded from: classes2.dex */
public final class v extends AbstractC5163j implements wf.n {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ C5971a f51716Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ Context f51717Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ String f51718h0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(Context context, C5971a c5971a, String str, AbstractC4825e abstractC4825e) {
        super(2, abstractC4825e);
        this.f51716Y = c5971a;
        this.f51717Z = context;
        this.f51718h0 = str;
    }

    @Override // pf.AbstractC5154a
    public final AbstractC4825e create(Object obj, AbstractC4825e abstractC4825e) {
        return new v(this.f51717Z, this.f51716Y, this.f51718h0, abstractC4825e);
    }

    @Override // wf.n
    public final Object invoke(Object obj, Object obj2) {
        y yVar = y.f36177a;
        ((v) create((F) obj, (AbstractC4825e) obj2)).invokeSuspend(yVar);
        return yVar;
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        String str;
        EnumC5000a enumC5000a = EnumC5000a.f41328Y;
        N.B0(obj);
        for (v4.m mVar : this.f51716Y.c().values()) {
            AbstractC3557B.Z(mVar);
            Bitmap bitmap = mVar.f47234f;
            String str2 = mVar.f47232d;
            if (bitmap == null) {
                AbstractC3557B.Z(str2);
                if (Lg.n.I2(str2, "data:", false) && Lg.n.l2(str2, "base64,", 0, false, 6) > 0) {
                    try {
                        String substring = str2.substring(Lg.n.k2(str2, ',', 0, false, 6) + 1);
                        AbstractC3557B.b0("substring(...)", substring);
                        byte[] decode = Base64.decode(substring, 0);
                        BitmapFactory.Options options = new BitmapFactory.Options();
                        options.inScaled = true;
                        options.inDensity = 160;
                        mVar.f47234f = BitmapFactory.decodeByteArray(decode, 0, decode.length, options);
                    } catch (IllegalArgumentException e10) {
                        I4.b.b("data URL did not have correct base64 format.", e10);
                    }
                }
            }
            Context context = this.f51717Z;
            if (mVar.f47234f == null && (str = this.f51718h0) != null) {
                try {
                    AssetManager assets = context.getAssets();
                    InputStream open = assets.open(str + str2);
                    AbstractC3557B.Z(open);
                    try {
                        BitmapFactory.Options options2 = new BitmapFactory.Options();
                        options2.inScaled = true;
                        options2.inDensity = 160;
                        mVar.f47234f = I4.g.e(BitmapFactory.decodeStream(open, null, options2), mVar.f47229a, mVar.f47230b);
                    } catch (IllegalArgumentException e11) {
                        I4.b.b("Unable to decode image.", e11);
                    }
                } catch (IOException e12) {
                    I4.b.b("Unable to open asset.", e12);
                }
            }
        }
        return y.f36177a;
    }
}
