package q;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import com.openai.chatgpt.R;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import mi.AbstractC4689a;
import p1.AbstractC5042g;
import s1.AbstractC5521c;
import s2.AbstractC5530A;

/* renamed from: q.w  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5241w {

    /* renamed from: a  reason: collision with root package name */
    public Object f43573a;

    /* renamed from: b  reason: collision with root package name */
    public Object f43574b;

    /* renamed from: c  reason: collision with root package name */
    public Object f43575c;

    /* renamed from: d  reason: collision with root package name */
    public Object f43576d;

    /* renamed from: e  reason: collision with root package name */
    public Object f43577e;

    /* renamed from: f  reason: collision with root package name */
    public Object f43578f;

    public C5241w(int i10) {
        if (i10 != 4) {
            if (i10 != 5) {
                this.f43573a = new int[]{2131230840, 2131230838, 2131230764};
                this.f43574b = new int[]{2131230788, R.drawable.abc_seekbar_tick_mark_material, R.drawable.abc_ic_menu_share_mtrl_alpha, R.drawable.abc_ic_menu_copy_mtrl_am_alpha, R.drawable.abc_ic_menu_cut_mtrl_alpha, R.drawable.abc_ic_menu_selectall_mtrl_alpha, R.drawable.abc_ic_menu_paste_mtrl_am_alpha};
                this.f43575c = new int[]{2131230837, 2131230839, 2131230781, R.drawable.abc_text_cursor_material, 2131230834, 2131230835, 2131230836};
                this.f43576d = new int[]{2131230813, R.drawable.abc_cab_background_internal_bg, 2131230812};
                this.f43577e = new int[]{R.drawable.abc_tab_indicator_material, R.drawable.abc_textfield_search_material};
                this.f43578f = new int[]{R.drawable.abc_btn_check_material, R.drawable.abc_btn_radio_material, R.drawable.abc_btn_check_material_anim, R.drawable.abc_btn_radio_material_anim};
                return;
            }
            this.f43573a = new ArrayList();
            this.f43574b = new ArrayList();
            this.f43575c = new ArrayList();
            this.f43576d = ti.f.f46255r;
            this.f43578f = xi.a.f50068Y;
        }
    }

    public static w2.p a(DataInputStream dataInputStream) {
        int readInt = dataInputStream.readInt();
        HashMap hashMap = new HashMap();
        for (int i10 = 0; i10 < readInt; i10++) {
            String readUTF = dataInputStream.readUTF();
            int readInt2 = dataInputStream.readInt();
            if (readInt2 >= 0) {
                int min = Math.min(readInt2, 10485760);
                byte[] bArr = AbstractC5530A.f45136f;
                int i11 = 0;
                while (i11 != readInt2) {
                    int i12 = i11 + min;
                    bArr = Arrays.copyOf(bArr, i12);
                    dataInputStream.readFully(bArr, i11, min);
                    min = Math.min(readInt2 - i12, 10485760);
                    i11 = i12;
                }
                hashMap.put(readUTF, bArr);
            } else {
                throw new IOException(android.gov.nist.core.a.e("Invalid value size: ", readInt2));
            }
        }
        return new w2.p(hashMap);
    }

    public static void b(w2.p pVar, DataOutputStream dataOutputStream) {
        Set<Map.Entry> entrySet = pVar.f47715b.entrySet();
        dataOutputStream.writeInt(entrySet.size());
        for (Map.Entry entry : entrySet) {
            dataOutputStream.writeUTF((String) entry.getKey());
            byte[] bArr = (byte[]) entry.getValue();
            dataOutputStream.writeInt(bArr.length);
            dataOutputStream.write(bArr);
        }
    }

    public static boolean d(int[] iArr, int i10) {
        for (int i11 : iArr) {
            if (i11 == i10) {
                return true;
            }
        }
        return false;
    }

    public static ColorStateList f(Context context, int i10) {
        int c10 = p1.c(context, R.attr.colorControlHighlight);
        return new ColorStateList(new int[][]{p1.f43522b, p1.f43524d, p1.f43523c, p1.f43526f}, new int[]{p1.b(context, R.attr.colorButtonNormal), AbstractC5521c.b(c10, i10), AbstractC5521c.b(c10, i10), i10});
    }

    public static LayerDrawable j(X0 x02, Context context, int i10) {
        BitmapDrawable bitmapDrawable;
        BitmapDrawable bitmapDrawable2;
        BitmapDrawable bitmapDrawable3;
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(i10);
        Drawable f6 = x02.f(context, R.drawable.abc_star_black_48dp);
        Drawable f10 = x02.f(context, R.drawable.abc_star_half_black_48dp);
        if ((f6 instanceof BitmapDrawable) && f6.getIntrinsicWidth() == dimensionPixelSize && f6.getIntrinsicHeight() == dimensionPixelSize) {
            bitmapDrawable2 = (BitmapDrawable) f6;
            bitmapDrawable = new BitmapDrawable(bitmapDrawable2.getBitmap());
        } else {
            Bitmap createBitmap = Bitmap.createBitmap(dimensionPixelSize, dimensionPixelSize, Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(createBitmap);
            f6.setBounds(0, 0, dimensionPixelSize, dimensionPixelSize);
            f6.draw(canvas);
            bitmapDrawable2 = new BitmapDrawable(createBitmap);
            bitmapDrawable = new BitmapDrawable(createBitmap);
        }
        bitmapDrawable.setTileModeX(Shader.TileMode.REPEAT);
        if ((f10 instanceof BitmapDrawable) && f10.getIntrinsicWidth() == dimensionPixelSize && f10.getIntrinsicHeight() == dimensionPixelSize) {
            bitmapDrawable3 = (BitmapDrawable) f10;
        } else {
            Bitmap createBitmap2 = Bitmap.createBitmap(dimensionPixelSize, dimensionPixelSize, Bitmap.Config.ARGB_8888);
            Canvas canvas2 = new Canvas(createBitmap2);
            f10.setBounds(0, 0, dimensionPixelSize, dimensionPixelSize);
            f10.draw(canvas2);
            bitmapDrawable3 = new BitmapDrawable(createBitmap2);
        }
        LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{bitmapDrawable2, bitmapDrawable3, bitmapDrawable});
        layerDrawable.setId(0, 16908288);
        layerDrawable.setId(1, 16908303);
        layerDrawable.setId(2, 16908301);
        return layerDrawable;
    }

    public static void o(Drawable drawable, int i10, PorterDuff.Mode mode) {
        PorterDuffColorFilter h10;
        int[] iArr = AbstractC5238u0.f43561a;
        Drawable mutate = drawable.mutate();
        if (mode == null) {
            mode = C5243x.f43584b;
        }
        PorterDuff.Mode mode2 = C5243x.f43584b;
        synchronized (C5243x.class) {
            h10 = X0.h(i10, mode);
        }
        mutate.setColorFilter(h10);
    }

    public final void c(String str, String str2) {
        Map map = (Map) this.f43578f;
        if (map != null) {
            map.put(str, str2);
            return;
        }
        throw new IllegalStateException("Property \"autoMetadata\" has not been set");
    }

    public final e7.h e() {
        String str;
        if (((String) this.f43573a) == null) {
            str = " transportName";
        } else {
            str = "";
        }
        if (((e7.l) this.f43575c) == null) {
            str = str.concat(" encodedPayload");
        }
        if (((Long) this.f43576d) == null) {
            str = android.gov.nist.core.a.g(str, " eventMillis");
        }
        if (((Long) this.f43577e) == null) {
            str = android.gov.nist.core.a.g(str, " uptimeMillis");
        }
        if (((Map) this.f43578f) == null) {
            str = android.gov.nist.core.a.g(str, " autoMetadata");
        }
        if (str.isEmpty()) {
            return new e7.h((String) this.f43573a, (Integer) this.f43574b, (e7.l) this.f43575c, ((Long) this.f43576d).longValue(), ((Long) this.f43577e).longValue(), (Map) this.f43578f);
        }
        throw new IllegalStateException("Missing required properties:".concat(str));
    }

    public final void g(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            AbstractC4689a abstractC4689a = (AbstractC4689a) it.next();
            if (abstractC4689a instanceof xi.b) {
                ((xi.b) abstractC4689a).a(this);
            }
        }
    }

    public final w2.l h(String str) {
        return (w2.l) ((HashMap) this.f43573a).get(str);
    }

    public final w2.l i(String str) {
        int i10;
        w2.l lVar = (w2.l) ((HashMap) this.f43573a).get(str);
        if (lVar == null) {
            SparseArray sparseArray = (SparseArray) this.f43574b;
            int size = sparseArray.size();
            int i11 = 0;
            if (size == 0) {
                i10 = 0;
            } else {
                i10 = sparseArray.keyAt(size - 1) + 1;
            }
            if (i10 < 0) {
                while (i11 < size && i11 == sparseArray.keyAt(i11)) {
                    i11++;
                }
                i10 = i11;
            }
            w2.l lVar2 = new w2.l(i10, str, w2.p.f47713c);
            ((HashMap) this.f43573a).put(str, lVar2);
            ((SparseArray) this.f43574b).put(i10, str);
            ((SparseBooleanArray) this.f43576d).put(i10, true);
            ((w2.o) this.f43577e).f(lVar2);
            return lVar2;
        }
        return lVar;
    }

    public final ColorStateList k(Context context, int i10) {
        if (i10 == R.drawable.abc_edit_text_material) {
            return AbstractC5042g.b(context, R.color.abc_tint_edittext);
        }
        if (i10 == 2131230830) {
            return AbstractC5042g.b(context, R.color.abc_tint_switch_track);
        }
        if (i10 == R.drawable.abc_switch_thumb_material) {
            int[][] iArr = new int[3];
            int[] iArr2 = new int[3];
            ColorStateList d10 = p1.d(context, R.attr.colorSwitchThumbNormal);
            if (d10 != null && d10.isStateful()) {
                int[] iArr3 = p1.f43522b;
                iArr[0] = iArr3;
                iArr2[0] = d10.getColorForState(iArr3, 0);
                iArr[1] = p1.f43525e;
                iArr2[1] = p1.c(context, R.attr.colorControlActivated);
                iArr[2] = p1.f43526f;
                iArr2[2] = d10.getDefaultColor();
            } else {
                iArr[0] = p1.f43522b;
                iArr2[0] = p1.b(context, R.attr.colorSwitchThumbNormal);
                iArr[1] = p1.f43525e;
                iArr2[1] = p1.c(context, R.attr.colorControlActivated);
                iArr[2] = p1.f43526f;
                iArr2[2] = p1.c(context, R.attr.colorSwitchThumbNormal);
            }
            return new ColorStateList(iArr, iArr2);
        } else if (i10 == R.drawable.abc_btn_default_mtrl_shape) {
            return f(context, p1.c(context, R.attr.colorButtonNormal));
        } else {
            if (i10 == R.drawable.abc_btn_borderless_material) {
                return f(context, 0);
            }
            if (i10 == R.drawable.abc_btn_colored_material) {
                return f(context, p1.c(context, R.attr.colorAccent));
            }
            if (i10 != 2131230825 && i10 != R.drawable.abc_spinner_textfield_background_material) {
                if (d((int[]) this.f43574b, i10)) {
                    return p1.d(context, R.attr.colorControlNormal);
                }
                if (d((int[]) this.f43577e, i10)) {
                    return AbstractC5042g.b(context, R.color.abc_tint_default);
                }
                if (d((int[]) this.f43578f, i10)) {
                    return AbstractC5042g.b(context, R.color.abc_tint_btn_checkable);
                }
                if (i10 == R.drawable.abc_seekbar_thumb_material) {
                    return AbstractC5042g.b(context, R.color.abc_tint_seek_thumb);
                }
                return null;
            }
            return AbstractC5042g.b(context, R.color.abc_tint_spinner);
        }
    }

    public final void l(long j6) {
        w2.o oVar;
        ((w2.o) this.f43577e).e(j6);
        w2.o oVar2 = (w2.o) this.f43578f;
        if (oVar2 != null) {
            oVar2.e(j6);
        }
        if (!((w2.o) this.f43577e).c() && (oVar = (w2.o) this.f43578f) != null && oVar.c()) {
            ((w2.o) this.f43578f).g((HashMap) this.f43573a, (SparseArray) this.f43574b);
            ((w2.o) this.f43577e).b((HashMap) this.f43573a);
        } else {
            ((w2.o) this.f43577e).g((HashMap) this.f43573a, (SparseArray) this.f43574b);
        }
        w2.o oVar3 = (w2.o) this.f43578f;
        if (oVar3 != null) {
            oVar3.delete();
            this.f43578f = null;
        }
    }

    public final void m(String str) {
        w2.l lVar = (w2.l) ((HashMap) this.f43573a).get(str);
        if (lVar != null && lVar.f47698c.isEmpty() && lVar.f47699d.isEmpty()) {
            ((HashMap) this.f43573a).remove(str);
            int i10 = lVar.f47696a;
            boolean z10 = ((SparseBooleanArray) this.f43576d).get(i10);
            ((w2.o) this.f43577e).a(lVar, z10);
            if (z10) {
                ((SparseArray) this.f43574b).remove(i10);
                ((SparseBooleanArray) this.f43576d).delete(i10);
                return;
            }
            ((SparseArray) this.f43574b).put(i10, null);
            ((SparseBooleanArray) this.f43575c).put(i10, true);
        }
    }

    public final void n(e7.l lVar) {
        if (lVar != null) {
            this.f43575c = lVar;
            return;
        }
        throw new NullPointerException("Null encodedPayload");
    }

    public final void p() {
        ((w2.o) this.f43577e).d((HashMap) this.f43573a);
        int size = ((SparseBooleanArray) this.f43575c).size();
        for (int i10 = 0; i10 < size; i10++) {
            ((SparseArray) this.f43574b).remove(((SparseBooleanArray) this.f43575c).keyAt(i10));
        }
        ((SparseBooleanArray) this.f43575c).clear();
        ((SparseBooleanArray) this.f43576d).clear();
    }
}
