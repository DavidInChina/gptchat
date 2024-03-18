package k1;

import android.content.Context;
import android.content.res.XmlResourceParser;
import android.gov.nist.core.Separators;
import android.gov.nist.javax.sip.header.ParameterNames;
import android.util.SparseArray;
import android.util.Xml;
import io.sentry.android.core.AbstractC3612c;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes.dex */
public final class h {

    /* renamed from: a  reason: collision with root package name */
    public SparseArray f36852a;

    /* renamed from: b  reason: collision with root package name */
    public SparseArray f36853b;

    /* JADX WARN: Code restructure failed: missing block: B:114:0x01d3, code lost:
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(Context context, XmlResourceParser xmlResourceParser) {
        int i10;
        int eventType;
        i iVar;
        n nVar = new n();
        int attributeCount = xmlResourceParser.getAttributeCount();
        for (int i11 = 0; i11 < attributeCount; i11++) {
            if (ParameterNames.ID.equals(xmlResourceParser.getAttributeName(i11))) {
                String attributeValue = xmlResourceParser.getAttributeValue(i11);
                if (attributeValue.contains(Separators.SLASH)) {
                    i10 = context.getResources().getIdentifier(attributeValue.substring(attributeValue.indexOf(47) + 1), ParameterNames.ID, context.getPackageName());
                } else {
                    i10 = -1;
                }
                if (i10 == -1) {
                    if (attributeValue.length() > 1) {
                        i10 = Integer.parseInt(attributeValue.substring(1));
                    } else {
                        AbstractC3612c.c("ConstraintLayoutStates", "error in parsing id");
                    }
                }
                try {
                    eventType = xmlResourceParser.getEventType();
                    iVar = null;
                } catch (IOException e10) {
                    e10.printStackTrace();
                } catch (XmlPullParserException e11) {
                    e11.printStackTrace();
                }
                while (eventType != 1) {
                    if (eventType != 0) {
                        char c10 = 3;
                        if (eventType != 2) {
                            if (eventType != 3) {
                                continue;
                            } else {
                                String name = xmlResourceParser.getName();
                                if (!"ConstraintSet".equals(name)) {
                                    if (name.equalsIgnoreCase("Constraint")) {
                                        nVar.f36944c.put(Integer.valueOf(iVar.f36854a), iVar);
                                        iVar = null;
                                    }
                                } else {
                                    this.f36853b.put(i10, nVar);
                                    return;
                                }
                            }
                        } else {
                            String name2 = xmlResourceParser.getName();
                            switch (name2.hashCode()) {
                                case -2025855158:
                                    if (name2.equals("Layout")) {
                                        c10 = 5;
                                        break;
                                    }
                                    c10 = '\uffff';
                                    break;
                                case -1984451626:
                                    if (name2.equals("Motion")) {
                                        c10 = 6;
                                        break;
                                    }
                                    c10 = '\uffff';
                                    break;
                                case -1269513683:
                                    if (name2.equals("PropertySet")) {
                                        break;
                                    }
                                    c10 = '\uffff';
                                    break;
                                case -1238332596:
                                    if (name2.equals("Transform")) {
                                        c10 = 4;
                                        break;
                                    }
                                    c10 = '\uffff';
                                    break;
                                case -71750448:
                                    if (name2.equals("Guideline")) {
                                        c10 = 1;
                                        break;
                                    }
                                    c10 = '\uffff';
                                    break;
                                case 1331510167:
                                    if (name2.equals("Barrier")) {
                                        c10 = 2;
                                        break;
                                    }
                                    c10 = '\uffff';
                                    break;
                                case 1791837707:
                                    if (name2.equals("CustomAttribute")) {
                                        c10 = 7;
                                        break;
                                    }
                                    c10 = '\uffff';
                                    break;
                                case 1803088381:
                                    if (name2.equals("Constraint")) {
                                        c10 = 0;
                                        break;
                                    }
                                    c10 = '\uffff';
                                    break;
                                default:
                                    c10 = '\uffff';
                                    break;
                            }
                            switch (c10) {
                                case 0:
                                    iVar = n.d(context, Xml.asAttributeSet(xmlResourceParser));
                                    continue;
                                case 1:
                                    iVar = n.d(context, Xml.asAttributeSet(xmlResourceParser));
                                    iVar.f36857d.f36883a = true;
                                    continue;
                                case 2:
                                    iVar = n.d(context, Xml.asAttributeSet(xmlResourceParser));
                                    iVar.f36857d.f36888c0 = 1;
                                    continue;
                                case 3:
                                    if (iVar != null) {
                                        iVar.f36855b.a(context, Xml.asAttributeSet(xmlResourceParser));
                                        continue;
                                    } else {
                                        throw new RuntimeException("XML parser error must be within a Constraint " + xmlResourceParser.getLineNumber());
                                    }
                                case 4:
                                    if (iVar != null) {
                                        iVar.f36858e.a(context, Xml.asAttributeSet(xmlResourceParser));
                                        continue;
                                    } else {
                                        throw new RuntimeException("XML parser error must be within a Constraint " + xmlResourceParser.getLineNumber());
                                    }
                                case 5:
                                    if (iVar != null) {
                                        iVar.f36857d.a(context, Xml.asAttributeSet(xmlResourceParser));
                                        continue;
                                    } else {
                                        throw new RuntimeException("XML parser error must be within a Constraint " + xmlResourceParser.getLineNumber());
                                    }
                                case 6:
                                    if (iVar != null) {
                                        iVar.f36856c.a(context, Xml.asAttributeSet(xmlResourceParser));
                                        continue;
                                    } else {
                                        throw new RuntimeException("XML parser error must be within a Constraint " + xmlResourceParser.getLineNumber());
                                    }
                                case 7:
                                    if (iVar != null) {
                                        C4154b.a(context, xmlResourceParser, iVar.f36859f);
                                        continue;
                                    } else {
                                        throw new RuntimeException("XML parser error must be within a Constraint " + xmlResourceParser.getLineNumber());
                                    }
                            }
                        }
                    } else {
                        xmlResourceParser.getName();
                    }
                    eventType = xmlResourceParser.next();
                }
                this.f36853b.put(i10, nVar);
                return;
            }
        }
    }
}
