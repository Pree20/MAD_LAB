import 'package:flutter/material.dart';

void main() {
  runApp(MyApp());
}

class MyApp extends StatefulWidget {
  MyApp({Key? key}) : super(key: key);

  @override
  State<MyApp> createState() => _MyAppState();
}

class _MyAppState extends State<MyApp> {
  List<List<dynamic>> items = [
    ["Dosa", 50.0],
    ["Idli", 20.0],
    ["Chapathi", 10.0]
  ];
  double total = 0;
  List<bool> isSelected = [false, false, false];

  List<Widget> buildWidgetsFromList(List items) {
    List<Widget> w = [];
    for (int i = 0; i < items.length; i++) {
      w.add(Container(
        padding: EdgeInsets.symmetric(horizontal: 50.0, vertical: 20.0),
        child: Row(
          children: [
            Expanded(child: Container(height: 30, child: Text(items[i]![0]))),
            Expanded(
              child:
                  Container(height: 30, child: Text(items[i]![1].toString())),
            ),
            Checkbox(
                checkColor: Colors.white,
                value: isSelected[i],
                onChanged: (bool? value) {
                  if (value == true) {
                    total += items[i][1];
                  } else if (value == false) {
                    total -= items[i][1];
                  }
                  setState(() {
                    isSelected[i] = value!;
                  });
                })
          ],
        ),
      ));
    }
    w.add(Text("Total:${total}"));
    return w;
  }

  @override
  Widget build(BuildContext context) {
    return MaterialApp(
      title: 'Menu',
      home: Scaffold(
        appBar: AppBar(
          title: Text("Food Menu"),
          centerTitle: true,
        ),
        // body: ToggleButtons(
        //     children: buildWidgetsFromList(items), isSelected: isSelected),
        body: Column(
          children: buildWidgetsFromList(items),
        ),
      ),
    );
  }
}
